import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { TaskService } from '../../service/task.service';
import { Task } from 'src/app/Task';

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {
  tasks:Task[]=[];
  constructor(private taskService:TaskService) {
    
   }

  ngOnInit(): void {
    // el this apunta al tasks de línea 11, lo llena con el getter del service
    this.taskService.getTasks().subscribe(response=>
      this.tasks=response)
  }

  borrarTaskDB(task:Task){
    this.taskService.borrarTaskDB(task).subscribe(()=>
      this.tasks=this.tasks.filter(t=> t.id !== task.id)
    )
    return alert(`tarea "${task.text}" fue eliminada`)
  }

}
