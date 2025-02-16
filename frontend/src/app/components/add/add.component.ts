import { Component, ElementRef, Renderer2, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-add',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css'],
})
export class AddComponent {
  puebloForm: FormGroup;
  @ViewChild('territoriosContainer') // Busca un elemento en la plantilla con #territoriosContainer.
  territoriosContainer!: ElementRef; // Guarda la referencia en la variable

  constructor(private fb: FormBuilder, private renderer: Renderer2) {
    // Renderer2 es un servicio de Angular que permite manipular el DOM de forma segura, evitando accesos directos con document.querySelector()
    this.puebloForm = this.fb.group({
      nombrePueblo: [''],
      numTerritorios: [0],
    });
  }

  generarTerritorios() {
    const numTerritorios = this.puebloForm.get('numTerritorios')?.value; // Si el control no existe (null o undefined), el operador ?. evita que la aplicación falle con un error.
    this.territoriosContainer.nativeElement.innerHTML = ''; // Limpiar antes de agregar nuevos

    for (let i = 1; i <= numTerritorios; i++) {
      const territorioDiv = this.renderer.createElement('div');
      this.renderer.addClass(territorioDiv, 'mb-3');
      this.renderer.addClass(territorioDiv, 'border');
      this.renderer.addClass(territorioDiv, 'p-3');
      this.renderer.addClass(territorioDiv, 'rounded');

      // Campo de texto para el nombre del territorio
      const inputText = this.renderer.createElement('input');
      this.renderer.setAttribute(inputText, 'type', 'text');
      this.renderer.setAttribute(inputText, 'class', 'form-control mb-2');
      this.renderer.setAttribute(
        inputText,
        'placeholder',
        `Nombre del territorio ${i}`
      );
      this.renderer.appendChild(territorioDiv, inputText);

      // Campo para subir imagen
      const inputFile = this.renderer.createElement('input');
      this.renderer.setAttribute(inputFile, 'type', 'file');
      this.renderer.setAttribute(inputFile, 'class', 'form-control');
      this.renderer.setAttribute(inputFile, 'accept', 'image/*');
      this.renderer.appendChild(territorioDiv, inputFile);

      // Agregar al contenedor
      this.renderer.appendChild(
        this.territoriosContainer.nativeElement,
        territorioDiv
      );
    }
  }

  guardarPueblo(event: Event) {
    event.preventDefault();
    alert(
      `Pueblo: ${this.puebloForm.get('nombrePueblo')?.value}, Territorios: ${
        this.puebloForm.get('numTerritorios')?.value
      }`
    );
  }
}
