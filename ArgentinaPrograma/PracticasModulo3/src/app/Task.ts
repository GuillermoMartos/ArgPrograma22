// intrface es como modelo objeto que parece modelo para dbs :), fijate que en el mock-tasks los valores deben ser los que determinamos acá

export interface Task{
    id:number,
    text:string,
    day:string,
    reminder:boolean
}

//ANGULAR HTTP CLIENT MODULE INFO: Use an interface rather than a class, because the response is a plain object that cannot be automatically converted to an instance of a class.
// export interface Config {
//   heroesUrl: string;
//   textfile: string;
//   date: any;
// }