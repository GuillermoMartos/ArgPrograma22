// intrface es como modelo objeto que parece modelo para dbs :), fijate que en el mock-tasks los valores deben ser los que determinamos acá

export interface Task{
    id:number,
    text:string,
    day:string,
    reminder:boolean
}