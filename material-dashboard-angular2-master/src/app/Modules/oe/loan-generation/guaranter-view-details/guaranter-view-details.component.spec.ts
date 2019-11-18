import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GuaranterViewDetailsComponent } from './guaranter-view-details.component';

describe('GuaranterViewDetailsComponent', () => {
  let component: GuaranterViewDetailsComponent;
  let fixture: ComponentFixture<GuaranterViewDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GuaranterViewDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GuaranterViewDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
