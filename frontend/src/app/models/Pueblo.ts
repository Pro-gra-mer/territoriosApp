import { Territorio } from './Territorio';

export interface Pueblo {
  nombrePueblo: string;
  numTerritorios: number;
  territorios: Territorio[];
}
