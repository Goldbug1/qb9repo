package com.qb9.examen

class ListadoController {

    def index() {
		
		def listItems = []
		listItems << new Item(descripcion: 'Sam1', valor:47)
		listItems << new Item(descripcion: 'Sam2', valor:50)
		listItems << new Item(descripcion: 'Sam3', valor:30)
		[ list:listItems ]
		
	}
}
