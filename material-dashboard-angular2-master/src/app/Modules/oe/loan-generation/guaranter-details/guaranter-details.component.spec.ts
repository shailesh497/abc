import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GuaranterDetailsComponent } from './guaranter-details.component';

describe('GuaranterDetailsComponent', () => {
  let component: GuaranterDetailsComponent;
  let fixture: ComponentFixture<GuaranterDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GuaranterDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GuaranterDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
