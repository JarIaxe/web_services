import { Component, OnInit } from '@angular/core';
import { Persons } from '../mock-persons';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {
  persons = Persons;
  constructor() { }

  ngOnInit(): void {
  }

}
