import java.awt.event.ItemEvent;

import com.qb9.examen.Item
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
	
	// agrego valores dummys en startup
	def item = new Item();
	item.setDesc("VD1")
	item.setValor(1)
	item.save();
	
	def item1 = new Item();
	item1.setDesc("VD2")
	item1.setValor(2)
	item1.save();
	
	def item2 = new Item();
	item2.setDesc("VD3")
	item2.setValor(3)
	item2.save();
	
}
    def destroy = {
    }
}
