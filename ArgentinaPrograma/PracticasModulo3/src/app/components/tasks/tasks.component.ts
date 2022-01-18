import { Component, OnInit, Input } from '@angular/core';
import { TaskService } from '../../service/task.service';
import { Task } from 'src/app/Task';

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {
  isValid:boolean=false
  tasks:Task[]=[];
  
  constructor(private taskService:TaskService) {
    
   }

  ngOnInit(): void {
    // el this apunta al tasks de línea 11, lo llena con el getter del service
    this.taskService.getTasks().subscribe(response=>
      this.tasks=response)
  }

  borrarTask(task:Task){
    this.taskService.borrarTaskDB(task).subscribe()
    alert(`tarea "${task.text}" fue eliminada`)
    this.taskService.getTasks().subscribe(response=>
      this.tasks=response)
  }

  setReminder(task:Task){
    task.reminder=!task.reminder
    this.taskService.cambiarReminderDB(task).subscribe()
  }

  addTaskDB(task:Task){
    this.taskService.agregarTaskDB(task).subscribe()
    alert(`task ${task.text} agregada exitosamente`)
    this.taskService.getTasks().subscribe(response=>
      this.tasks=response)
    this.isValid=false
  }

  onShowAdd(showAdd:any){
    this.isValid=showAdd.value
  }

}
