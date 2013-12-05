package com.strumbystrum.guestbook

class User {

    String name
    String email
    String picUrl
    Date dateCreated
    Date lastUpdated


    static constraints = {
        name (blank:false, nullable:false, size:3..30, matches:"[a-zA-Z1-9_]+")
        email (email:true)
        picUrl (url: true)
    }

    String toString(){
        return name;
    }
}
