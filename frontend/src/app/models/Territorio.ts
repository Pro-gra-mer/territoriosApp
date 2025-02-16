export interface Territorio {
  nombre: string;
  imagen: File | null;
  fechaEntrega?: Date | null;
  fechaDevolucion?: Date | null;
}
