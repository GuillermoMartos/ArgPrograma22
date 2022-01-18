import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  @Output() clickAgregar:EventEmitter<any>=new EventEmitter()
  title : string ="Tasker 2.3"
  constructor() { }

  ngOnInit(): void {
  }

  sumaTareas(){
    // this.clickAgregar.emit({'text':"hacer la tarea",
    // 'day':'3 de Febrero','reminder':true})

  }
  
  onClick() {
    // la función debe emitir un evento hacia afuera, por eso output y la variable a la cual vamos a bindear esta función... la vamos a recuperar en las instanciaciones del componente (o sea, donde la llamamos como <app-button/>, o sea en el html del header)
    let showAdd={
      value:true
    }
    this.clickAgregar.emit(showAdd)
  }

}
