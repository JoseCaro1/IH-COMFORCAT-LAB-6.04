import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/models/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employeeList:Array<Employee>=[];
 

  constructor(private employeeService:EmployeeService) { }

  ngOnInit(): void {
    this.getEmployee();
  }

  getEmployee():void {
    this.employeeService.getEmployeeList().subscribe(result => {
      this.employeeList=result;
    });
  }

  removeEmployee(id:number):void {
    this.employeeService.removeEmployee(id).subscribe((response) => {});
    let index=this.employeeList.findIndex((value) => value.id==id);
    this.employeeList.splice(index,1);
  }

}
