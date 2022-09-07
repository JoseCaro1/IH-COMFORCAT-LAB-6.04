import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http'
import { Employee } from '../models/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private readonly _baseUrl= "http://localhost:8080/"
  constructor(private http:HttpClient) { }


  getEmployeeList(): Observable<Array<Employee>> {
    return this.http.get<Array<Employee>>(this._baseUrl+"employee/find-all");
  }
  removeEmployee(id:number): Observable<void> {
    return this.http.delete<void>(this._baseUrl+"employee/"+id);
  }

}
export interface EmployeeInterface {
  id:number,
  name:string,
  phoneNumber:string,
  officeNumber:string,
  position:string,
  manager:string
}
