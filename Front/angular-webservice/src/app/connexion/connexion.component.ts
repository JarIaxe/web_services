import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent implements OnInit {
  Userid = "test";



  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(){
    alert(this.Userid);
    
  }

}
