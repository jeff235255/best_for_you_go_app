/*
  EXAMPLE OF REST API USING MONGODB  
*/
package main 

// IMPORT PACKAGE
import (
  "encoding/json"
  "fmt"
  "gopkg.in/mgo.v2"
  "gopkg.in/mgo.v2/bson"
  "log"
  "net/http"
  "strings"
  "html/template"
)

// DEFIND STRUCT FOR USERS TABLE
type User struct {
  Name string      `json:"name"`
  Email string     `json:"email"`
  Age string       `json:"age"`
  Address string   `json:"address"`
}

// MAIN FUNCTION, HANDLE ALL REQUEST FROM CLIENT
func main() {
  http.HandleFunc("/", indexHandler)
  http.HandleFunc("/sign_in", signinHandler)
  http.HandleFunc("/sign_up", signupHandler)
  http.HandleFunc("/users", usersApiHandler)
  http.Handle("/css/", http.StripPrefix("/css/", http.FileServer(http.Dir("css"))))
  http.Handle("/images/", http.StripPrefix("/images/", http.FileServer(http.Dir("images"))))

  err := http.ListenAndServe(":8080", nil)

  if err != nil {
    panic(err)
  }
}


// MAIN HANDLER
func indexHandler(res http.ResponseWriter, r *http.Request) {
  index := template.Must(template.ParseFiles("templates/index.gtpl"))
  index.Execute(res, nil)
}

// SIGN IN USER
func signinHandler(res http.ResponseWriter, r *http.Request) {
  sign_in := template.Must(template.ParseFiles("templates/sign_in.gtpl"))
  sign_in.Execute(res, nil)
}

// SIGN UP USER
func signupHandler(res http.ResponseWriter, r *http.Request) {
  sign_up := template.Must(template.ParseFiles("templates/sign_up.gtpl"))
  sign_up.Execute(res, nil)
}

// FORGOT PASSWORD
func forgotPasswordHandler(res http.ResponseWriter, r *http.Request) {

}

// USERS API HANDLER
func usersApiHandler(res http.ResponseWriter, r *http.Request) {
  session, err := mgo.Dial("localhost")

  if err != nil {
    panic(err)
  }

  defer session.Close()

  session.SetMode(mgo.Monotonic, true)

  collection := session.DB("api_example").C("users")

  var result []User

  id := strings.Replace(r.URL.Path, "/users", "", -1)

  res.Header().Set("Content-type", "application/json")

  switch r.Method {
  case "GET":
    // IF NO ID PARSED FROM URL, WILL GET LIST OF USERS
    if id != "" {
      err = collection.Find(bson.M{"_id": bson.ObjectIdHex(id)}).All(&result)

      if err != nil {
        log.Fatal(err)
      }
    } else {
      err = collection.Find(nil).All(&result)
    }
  case "POST":
  case "PUT":
  case "DELETE":
  default:

  } 

  json, err := json.Marshal(result)
  
  if err != nil {
    fmt.Println(err)
    return
  }

  fmt.Fprintf(res, "%v", string(json))
}




