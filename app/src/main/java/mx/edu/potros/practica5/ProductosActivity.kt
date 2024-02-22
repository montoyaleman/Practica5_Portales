package mx.edu.potros.practica5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class ProductosActivity : AppCompatActivity() {
    var menu: ArrayList<Product> = ArrayList<Product>()

    override fun onCreate (savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        var listView: ListView = findViewById(R.id.litview) as ListView

        var adaptador: AdaptadorProductos = AdaptadorProductos(this, menu)

        var image: ImageView = findViewById(R.id.imageView4)
        listView.adapter = adaptador


        when(menuOption){
            "Antojitos" -> image.setImageResource(R.drawable.antojitos)
            "Mar" -> image.setImageResource(R.drawable.especialidades)
            "Combos" -> image.setImageResource(R.drawable.combinations)
            "Tortas"-> image.setImageResource(R.drawable.tortas)
            "Sopas"-> image.setImageResource(R.drawable.sopas)
            "Side"-> image.setImageResource(R.drawable.sopas)
            "Bebidas"-> image.setImageResource(R.drawable.drinks)
        }
    }

    fun agregarProductos(option:String?){
        when(option){
            "Antojitos" -> {
                menu.add(Product("Quesadillas", R.drawable.quesadillas,
                    "Rellenas con su carne favorita, servidas con ensalado. Filled with your choice of meat, served with salad",
                    5.69))
                menu.add(Product("Huaraches", R.drawable.huaraches,
                    "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big thick tortilla with beans, your choice of meat, fresh cheese and sour cream.",
                    10.99))
                menu.add(Product("Sincronizada", R.drawable.sincronizadas,
                    "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole - Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.",
                    7.99))

                menu.add(Product("Sopes", R.drawable.sopes,
                    "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream.",
                    3.79))

                menu.add(Product("Tostadas", R.drawable.tostadas,
                    "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate - Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes.",
                    4.50))

                menu.add(Product("Coctel Mixto", R.drawable.coctel, "", 21.99))

                menu.add(Product("Coctel de Camaron", R.drawable.coctel, "", 16.49))


            }

            "Mar" ->{
                menu.add(Product("Mojita Frita - Fried Fish", R.drawable.mojarra,
                    "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.",
                    17.99))

                menu.add(Product("Ceviche", R.drawable.ceviche,
                    "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips",
                    6.99))

                menu.add(Product("Botana de Camarones al Mojo de Ajo", R.drawable.botanacamarones, "", 19.99))

                menu.add(Product("Botana de Camarones a la Diabla ", R.drawable.botanacamarones, "", 19.99))

                menu.add(Product("Torre de Camaron Negro", R.drawable.caldocamaron, "", 16.99))

                menu.add(Product("Botana de Pulpo a la Diabla", R.drawable.quesadillas,
                    "Servido totopos, cebolla frita, arroz, lechuga y pico de gallo - Served with chips, grill onions, rice, lettuce and pico de gallo.",
                    24.99))

                menu.add(Product("Botanas de Pulpo al Mojo de Ajo", R.drawable.quesadillas,
                    "Servido totopos, cebolla frita, arroz, lechuga y pico de gallo - Served with chips, grill onions, rice, lettuce and pico de gallo.", 24.99))

                menu.add(Product("Pulpo al Mojo de Ajo", R.drawable.quesadillas, "", 35.00))

                menu.add(Product("Pulpo Zarandeado", R.drawable.quesadillas, "", 35.00))

                menu.add(Product("Platillos de Camaron al mojo de Ajo", R.drawable.quesadillas, "", 18.99))

                menu.add(Product("Platillos de Camaron a la diabla", R.drawable.quesadillas, "", 18.99))
            }
            "Combos" ->{
                menu.add(Product("Traditional Taco Combo", R.drawable.combinationtaco,
                    "Tortilla de Maíz y tu carne favorita. Servido con arroz y frijoles - Corn taco, your choice of meat, served with rice and beans.",
                    6.99))

                menu.add(Product("Mexican Burritos", R.drawable.burritos,
                    "Tu carne favorita en una tortilla grande de harina rellena con cebolla frita, pico de gallo, guacamole, sour cream, frijoles y acompañado de arroz " +
                            "-Your choice of meat on a big burrito made of flour tortilla with rice, beans, lettuce, grilled onions, pico de gallo, guacamole and sour cream.",
                    12.99))

                menu.add(Product("Los Portales Burritos", R.drawable.burritosportales,
                    "Large flour tortilla filled with grilled cactus, steak, pastor (seasoned pork), grilled onions, rice and beans. Served with a side of lettuce salad, tomatoes, sour cream and guacamole.",
                    13.59))

                menu.add(Product("Cinco", R.drawable.cinco,
                    "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans.",
                    9.99))

                menu.add(Product("Dos Amigos", R.drawable.cinco,
                    "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. served with a side of rice and beans",
                    9.99))

                menu.add(Product("Burrito Pepe", R.drawable.burritopepe,
                    "Flour tortilla filled with your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. served with a side of rice.",
                    9.99))

                menu.add(Product("Fajita Burrito", R.drawable.burritos,
                    "Gran burrito relleno de tu carne favorita, cebolla, chile, arroz, frijoles y jitomate. Servido con lechuga y guacamole " +
                        "- Large burrito filled with your choice of meat, onions, chile, peppers, rice, beans and tomatoes. Served with lettuce guacamole and sour cream.",
                    13.59))

                menu.add(Product("Fajita Quesadilla", R.drawable.fajitaquesadilla, "Quesadilla extra grande (10 inches), rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada - " +
                        "10 inches quesadilla filled with your choice of meat, cooked with grilled onions, banana peppers and tomatoes. Served with rice beans and salad.",
                    13.99))
            }

            "Tortas"->{
                menu.add(Product("Torta Regular", R.drawable.torta,
                    "All tortas come with lettuce, onions, tomatoes, avocado, sour cream, jalapeno pepper and your choice of meat. \u200B",
                    12.99))

                menu.add(Product("Torta Milanesa de res o pollo", R.drawable.tortamilanesa,
                    "Breaded steak or chicken",
                    13.99))

                menu.add(Product("Torta Cubana", R.drawable.tortacubana,
                    "Chorizo, asada, jamon, pastor y queso Mexican sausage, steak, marinated pork, ham, and cheese",
                    13.99))

                menu.add(Product("Torta Mixta", R.drawable.tortamixta,
                    "Chorizo, asada y pastor./ Mexican sausage, steak and marinated pork.",
                    13.99))

                menu.add(Product("Small Mexican Torta", R.drawable.torta,
                    "Bolillo bread sandwich with your of meat, shredded lettuce, avocado, tomato, onion and sour cream.",
                    7.39))
            }

            "Sopas"->{
                menu.add(Product("Pozole", R.drawable.pozole,
                    "Weekends only",
                    5.99))

                menu.add(Product("Menudo", R.drawable.menudo,
                    "Wednesday to Sunday",
                    5.99))

                menu.add(Product("Caldo de Res", R.drawable.caldores,
                    "",
                    5.99))

                menu.add(Product("Caldo de Camaron", R.drawable.caldocamaron,
                    "Shrimp Soup",
                    13.99))

                menu.add(Product("Sopa de Mariscos", R.drawable.sopamariscos,
                    "Seafood soup",
                    19.99))
            }

            "Side"->{
                menu.add(Product("Side of Guacamole", R.drawable.torta,
                    "",
                    3.75))

                menu.add(Product("Side of rice", R.drawable.tortamilanesa,
                    "",
                    1.99))

                menu.add(Product("Side of Beans", R.drawable.tortacubana,
                    "",
                    1.99))

                menu.add(Product("Chips and Salsa", R.drawable.tortamixta,
                    "",
                    2.25))

                menu.add(Product("Flour Tacos", R.drawable.torta,
                    "",
                    2.99))
            }

            "Bebidas"->{
                menu.add(Product("Soft Drrinks 20oz - Sodas 20z", R.drawable.sodas,
                    "",
                    2.99))

                menu.add(Product("Jarritos", R.drawable.jarritos,
                    "",
                    2.75))

                menu.add(Product("Aguas Frescas", R.drawable.sodas,
                    "",
                    2.99))
            }
        }

        //menu.add(Product("", R.drawable.quesadillas, "", 5.69))

        /*
        menu.add(Product("", R.drawable.quesadillas,
        "",
        5.69))
         */

        //----------- Platillos Mar -----------





    }

    private class AdaptadorProductos: BaseAdapter {
        var producto = ArrayList<Product>()
        var contexto: Context?=null

        constructor(contexto: Context, producto: ArrayList<Product>){
            this.producto = producto
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return producto.size
        }

        override fun getItem(position: Int): Any {
            return producto[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod = producto[position]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view, null)

            var imagen = vista.findViewById(R.id.producto_img) as ImageView
            var nombre = vista.findViewById(R.id.producto_nombre) as TextView
            var desc = vista.findViewById(R.id.producto_desc) as TextView
            var precio = vista.findViewById(R.id.producto_precio) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")

            return vista
        }
    }
}