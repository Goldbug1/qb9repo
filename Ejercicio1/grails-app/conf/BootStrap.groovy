import com.qb9.examen.Role
import com.qb9.examen.User
import com.qb9.examen.UserRole

class BootStrap {

    def init = { servletContext ->
    def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
    def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
 
	// creo usuario admin
    def adminUser = new User(username: 'admin', password: 'admin')
    adminUser.save(flush: true)
 
    UserRole.create adminUser, adminRole, true
	
	// creo usuario test
	def testUser = new User(username: 'user', password: 'user')
	testUser.save(flush: true)
	
	UserRole.create testUser, userRole, true
	
    assert User.count() == 2
    assert Role.count() == 2
    assert UserRole.count() == 2
}
    def destroy = {
    }
}
