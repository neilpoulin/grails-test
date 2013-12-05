import com.strumbystrum.guestbook.User

class BootStrap {

    def init = { servletContext ->
        User user = new User(name:'lars', email:'muster@muster.com', picUrl:'http://www.vogella.com')
        if (!user.save()){
            log.error "Could not save user!!"
            log.error "${user.errors}"
        }

        User user2 = new User(name:'Neil', email:'neil@neilpoulin.com', picUrl:'http://www.neilpoulin.com')
        if (!user2.save()){
            log.error "Could not save user!!"
            log.error "${user2.errors}"
        }
    }
    def destroy = {
    }
}
