import { outputAst } from '@angular/compiler';
import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Employee } from 'src/app/models/employee';

@Component({
  selector: 'app-employee-card',
  templateUrl: './employee-card.component.html',
  styleUrls: ['./employee-card.component.css']
})
export class EmployeeCardComponent implements OnInit {

  @Input()
  employee:Employee = new Employee(0,"","","","","");
  isShowed:boolean = false;

  @Output()
  removeEvent:EventEmitter<number> = new EventEmitter()

  constructor() { }

  ngOnInit(): void {
  }

  removeEmployee():void {
    this.removeEvent.emit(this.employee.id);
  }

}
