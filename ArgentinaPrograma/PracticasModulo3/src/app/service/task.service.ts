import { Injectable } from '@angular/core';
import {HttpClient, HttpHandler, HttpErrorResponse} from '@angular/common/http'
import {Task} from '../Task'
// observable es como un suscribe, vuelve al componente asincrónico al estar pendiente de cambios
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { HttpHeaders } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class TaskService {
  private apiUrl="http://localhost:5000/tasks"
  
  private httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json'
    })
  };
  
  private handleError(error: HttpErrorResponse) {
    if (error.status === 0) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong.
      console.error(
        `Backend returned code ${error.status}, body was: `, error.error);
    }
    // Return an observable with a user-facing error message.
    return throwError(
      'Something bad happened; please try again later.');
  }
  constructor(
    private http:HttpClient
  ) { }

  // el módulo httpClient, que contine HttpClient, devuelve en la comunicación con otro servidor, un Observable: los obsrvables son testeables, asíncronos y permiten cahcar los errores en la comunicación servidores
  getTasks():Observable<Task[]>{
    return this.http.get<Task[]>(this.apiUrl, {responseType: 'json'})
    .pipe(
      catchError(this.handleError)
    );
  }
//GET METHOD INFO:   The get() method takes two arguments; the endpoint URL from which to fetch, and an options object that is used to configure the request.
//     {headers?: HttpHeaders | {[header: string]: string | string[]},
//     observe?: 'body' | 'events' | 'response',
//     params?: HttpParams|{[param: string]: string | number | boolean | ReadonlyArray<string | number | boolean>},
//     reportProgress?: boolean,
//     responseType?: 'arraybuffer'|'blob'|'json'|'text',
//     withCredentials?: boolean,
//   }
// The observe option specifies how much of the response to return.
// The responseType option specifies the format in which to return data.

  borrarTaskDB(task:Task):Observable<Task>{
    const pointer=`${this.apiUrl}/${task.id}`
    return this.http.delete<Task>(pointer)
  }

  // // está mal seguro
  cambiarReminderDB(task:Task):Observable<Task>{
  //   const pointer=`${this.apiUrl}/?id=${task.id}`
  //   const body={reminder:!task.reminder}
  //   return this.http.put<Task>(pointer,body)
  const pointer=`${this.apiUrl}/${task.id}`
  return this.http.put<Task>(pointer,task,this.httpOptions)

    
}

  // // está bien?
  // agregarTaskDB(task:Task):Observable<Task>{
  //   return (http)
  // }
}
