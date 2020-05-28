import { TestBed } from '@angular/core/testing';

import { DojoService } from './dojo.service';

describe('DojoService', () => {
  let service: DojoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DojoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
