package Tienda


/**
 * ## Class [Bebida]
 *
 *  Esta es una clase abstracta cuyos métodos y características
 *  heredarán el resto de clases que se creen y que representen un tipo específico de bebida.
 *  De esta clase no se crearán objetos directamente, solamente es la plantilla para las clases que hereden de ella.
 *
 * ### El proyecto en el que se encuentra esta clase simula el funcionamiento de una tienda de alimentación
 *
 * @constructor (litros: [Double], precio: [Double], marca:String, identificador:[Int]) </br>
 *
 *
 *
 * @param litros [Double] : Nº de litros que tiene esa bebida
 * @param precio [Double] : Precio de la bebida
 * @param marca [String] : Nombre de la marca que distribuye/produce esa bebida
 * @param identificador [Int] : Nº que identifica esa bebida en concreto. Es único para cada unidad de bebida.
 *
 *
 * [calcular_precio] este método abstracto (sin código),
 * deberán implementarlo todas las clases hijas que hereden de Bebida.
 *
 * [toString] Se sobreescribe la función de la clase ANY para poder imprimir un breve resumen del objeto creado
 * con sus parámetros
 *
 *
 * @author:  Patricio Cifredo
 *
 *  @since última modificación 23/03/2023
 *
 *
 */


abstract class Bebida(litros: Double, precio: Double, marca:String, identificador:Int) {

    var identificador=0
        get(){
            return field
        }
        set(value) {
            field=value

        }

    var litros=0.5
        get(){
            return field
        }

        set(value) {
            if (value<0.33){
                println("Error. el volumen mínimo es 0.33 litros debe ser mayor que 0\n")
            }
            else{
                field = value
            }

        }

    var precio=0.5
        get(){
            return field
        }

        set(value) {
            if (value<=0){
                println("Error. el precio debe ser mayor que 0\n")
            }
            else{
                field = value
            }

        }

    var marca="defecto"
        get(){
            return field
        }

        set(value) {
            if (value.length<4 || value.length>30){
                println("Error. el nombre de la marca debe tener entre 4 y 30 caracteres\n")
            }
            else{
                field = value
            }

        }

    init {
        this.identificador=identificador
        this.litros=litros
        this.precio=precio
        this.marca=marca
    }



    //método calcular precio

    abstract fun calcular_precio(cantidad:Int):Double

    override fun toString(): String {
        return "Bebida(identificador=$identificador, litros=$litros, precio=$precio, marca='$marca')"
    }





}