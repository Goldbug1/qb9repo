package asia.grails.tutorials

import asia.grails.tutorial.Person

class HelloController {

    def index() {
        Person person = new Person(firstName: 'Gustavo', lastName:'gavilan', age:99)
        [ person:person ]
    }
	
	def displayForm() {
		// just provide value for age. First Name and Last name are blanks.
		Person person = new Person(age:55)
		[ person:person ]
	}
}
