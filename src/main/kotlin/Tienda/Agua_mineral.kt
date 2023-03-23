package Tienda


/**
 * # Class [Agua_mineral]
 *
 * Esta clase es un tipo específico de bebida **Agua mineral**. Por ello hereda los métodos y características
 * de su clase madre Bebida y cuenta con un parámetro propio:
 *
 *
 * @param manantial_origen [String] : Lugar de origen del artículo </br>
 *
 * @return [calcular_precio] devuelve un valor [Double] resultante de multiplicar la cantidad por el precio del artículo
 *
 * @return [toString] devuelve la información de ese artículo de Agua mineral
 *
 */


class Agua_mineral: Bebida {


    var manantial_origen=""
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

    constructor(litros: Double, precio: Double, marca:String, identificador:Int, manantial_origen:String):super(
        litros, precio, marca, identificador){
        this.manantial_origen=manantial_origen
    }


    override fun calcular_precio(cantidad:Int):Double {
        return cantidad*precio
    }

    override fun toString(): String {
        return "Agua_mineral(identificador:$identificador, litros=$litros, precio=$precio, marca='$marca' +"+
                "manantial_origen='$manantial_origen')"
    }


}