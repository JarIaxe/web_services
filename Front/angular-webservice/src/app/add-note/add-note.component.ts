import { Component, OnInit } from '@angular/core';
import { Persons } from '../mock-persons';

@Component({
  selector: 'app-add-note',
  templateUrl: './add-note.component.html',
  styleUrls: ['./add-note.component.css']
})
export class AddNoteComponent implements OnInit {
  students = Persons;
  constructor() { }

  ngOnInit(): void {
  }

  saveResult(): void{
    
  }

}
