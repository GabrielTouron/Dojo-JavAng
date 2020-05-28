import { Component, OnInit} from '@angular/core';
import { Dojo } from './dojo.model';
import { DojoService } from './dojo.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {

  dojos: Dojo[] = [];

  constructor(private dojoService: DojoService) { }

  ngOnInit(): void {

    this.dojoService.getAll().subscribe( data => this.dojos = data );

  }
}

































































































