import { Component, OnInit } from '@angular/core';
import { Teachers } from '../mock-teacher';

@Component({
  selector: 'app-list-teacher',
  templateUrl: './list-teacher.component.html',
  styleUrls: ['./list-teacher.component.css']
})
export class ListTeacherComponent implements OnInit {
  teachers = Teachers
  constructor() { }

  ngOnInit(): void {
  }

}
