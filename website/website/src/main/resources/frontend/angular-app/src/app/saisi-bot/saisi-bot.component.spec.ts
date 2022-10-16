import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaisiBotComponent } from './saisi-bot.component';

describe('SaisiBotComponent', () => {
  let component: SaisiBotComponent;
  let fixture: ComponentFixture<SaisiBotComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SaisiBotComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SaisiBotComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
