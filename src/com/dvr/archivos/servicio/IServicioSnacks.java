/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dvr.archivos.servicio;

import com.dvr.archivos.dominio.Snack;
import java.util.List;

/**
 *
 * @author MB91491
 */
public interface IServicioSnacks {
    void agregarSnack(Snack snack);
    void mostrarSnacks();
    List<Snack> getSnacks();
}
