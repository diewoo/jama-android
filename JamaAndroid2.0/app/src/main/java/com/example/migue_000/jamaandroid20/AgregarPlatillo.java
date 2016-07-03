package com.example.migue_000.jamaandroid20;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by migue_000 on 29/06/2016.
 */
public class AgregarPlatillo implements Serializable {
    private List<Platillo> platillo = new ArrayList<>();

    public AgregarPlatillo() {
        //pasta
        platillo.add( new Platillo(1,"Pizza","http://res.cloudinary.com/jamacomida/image/upload/v1466004914/pizza-pepperoni-w857h456_ihevgu.jpg","Pruebe esta deliciosa pizza","pasta",123));
        platillo.add( new Platillo(2,"Lasagna","http://res.cloudinary.com/jamacomida/image/upload/v1466004914/Table-for-Two_Lasagna_640x428_nb1d1p.jpg","Pruebe esta deliciosa lasagna","pasta",123));
        platillo.add( new Platillo(3,"Fetuccini","http://res.cloudinary.com/jamacomida/image/upload/v1466004914/hqdefault_mczefe.jpg","Pruebe estos deliciosos fetuccinis","pasta",123));
        platillo.add( new Platillo(4,"Ravioles","http://res.cloudinary.com/jamacomida/image/upload/v1466004914/descarga_vegd0h.jpg","Pruebe estos deliciosos ravioles","pasta",123));
        platillo.add( new Platillo(5,"Canelones","http://res.cloudinary.com/jamacomida/image/upload/v1466004914/descarga_1_az0rau.jpg","Pruebe estos deliciosos canelones","pasta",123));
        //hamburguesa
        platillo.add( new Platillo(6,"Carne","http://res.cloudinary.com/jamacomida/image/upload/v1466005795/Crean-carne-hamburguesa-partir-impresora_TINIMA20130122_0412_5_fptfgx.jpg","Pruebe esta deliciosa hamburguesa de carne","hamburguesa",123));
        platillo.add( new Platillo(7,"Pollo","http://res.cloudinary.com/jamacomida/image/upload/v1466005796/6183_ddjfug.jpg","Pruebe esta deliciosa hamburguesa de pollo","hamburguesa",123));
        platillo.add( new Platillo(8,"Chorizo","http://res.cloudinary.com/jamacomida/image/upload/v1466005796/Hamburguesa_de_champi%C3%B1ones_y_chorizo-108_x2kdci.jpg","Pruebe esta deliciosa hamburguesa de chorizo","hamburguesa",123));
        platillo.add( new Platillo(9,"Hawaiana","http://res.cloudinary.com/jamacomida/image/upload/v1466005795/descarga_hjrpge.jpg","Pruebe esta deliciosa hamburguesa hawaiana","hamburguesa",123));
        platillo.add( new Platillo(10,"Vegetariana","http://res.cloudinary.com/jamacomida/image/upload/v1466005795/descarga_1_bjhpnq.jpg","Pruebe esta deliciosa hamburguesa vegetariana","hamburguesa",123));
        //marino
        platillo.add( new Platillo(11,"Ceviche","http://res.cloudinary.com/jamacomida/image/upload/v1466008560/descarga_osomfp.jpg","Pruebe este delicioso ceviche","marino",123));
        platillo.add( new Platillo(12,"Jalea","http://res.cloudinary.com/jamacomida/image/upload/v1466008560/jalea-de-pescado_obmgfb.jpg","Pruebe esta deliciosa jalea","marino",123));
        platillo.add( new Platillo(13,"Parihuela","http://res.cloudinary.com/jamacomida/image/upload/v1466008560/descarga_1_icniuo.jpg","Pruebe esta deliciosa parihuela","marino",123));
        platillo.add( new Platillo(14,"Sudado de pescado","http://res.cloudinary.com/jamacomida/image/upload/v1466008560/descarga_2_o1jas5.jpg","Pruebe este delicioso sudado de pescado","marino",123));
        platillo.add( new Platillo(15,"Leche de tigre","http://res.cloudinary.com/jamacomida/image/upload/v1466008560/3114-55e07cccac93c_nmdwip.jpg","Pruebe esta delicioso leche de tigre","marino",123));
        //criollo
        platillo.add( new Platillo(16,"Arroz con pollo","http://res.cloudinary.com/jamacomida/image/upload/v1466008738/arroz_pollo_fvoiom.jpg","Pruebe este delicioso arroz con pollo","criollo",123));
        platillo.add( new Platillo(17,"Carapulcra","http://res.cloudinary.com/jamacomida/image/upload/v1466008738/maxresdefault_lubtwr.jpg","Pruebe esta deliciosa carapulcra","criollo",123));
        platillo.add( new Platillo(18,"Lomo saltado","http://res.cloudinary.com/jamacomida/image/upload/v1466008738/descarga_1_lnpxkt.jpg","Pruebe este delicioso lomo saltado","criollo",123));
        platillo.add( new Platillo(19,"Ají de gallina","http://res.cloudinary.com/jamacomida/image/upload/v1466008738/descarga_qirash.jpg","Pruebe esta deliciosa ají de gallina","criollo",123));
        platillo.add( new Platillo(20,"Rocoto relleno","http://res.cloudinary.com/jamacomida/image/upload/v1466008738/descarga_2_ign06e.jpg","Pruebe este delicioso rocoto relleno","criollo",123));
        //light
        platillo.add( new Platillo(21,"Ensalada de palta","http://res.cloudinary.com/jamacomida/image/upload/v1466008971/descarga_zf2zbn.jpg","Pruebe esta deliciosa ensalada de palta","light",123));
        platillo.add( new Platillo(22,"Ensalada de lechuga","http://res.cloudinary.com/jamacomida/image/upload/v1466008970/hqdefault_qn9yjq.jpg","Pruebe esta deliciosa ensalada de lechuga","light",123));
        platillo.add( new Platillo(23,"Ensalada de frutas","http://res.cloudinary.com/jamacomida/image/upload/v1466008972/ensalada-de-fruta_t13s3n.jpg","Pruebe esta deliciosa ensalada de frutas","light",123));
        platillo.add( new Platillo(24,"Ensalada caprese","http://res.cloudinary.com/jamacomida/image/upload/v1466008971/descarga_1_hzelxo.jpg","Pruebe esta deliciosa ensalada caprese","light",123));
        platillo.add( new Platillo(25,"Ensalada a la jardinera","http://res.cloudinary.com/jamacomida/image/upload/v1466008971/7b245833-90d1-4a2f-99af-0cd2ef10cac0_ekq8qk.jpg","Pruebe esta deliciosa ensalada a la jardinera","light",123));
        //postres
        platillo.add( new Platillo(26,"Picarones","http://res.cloudinary.com/jamacomida/image/upload/v1466009139/163116_83334_fw6qlb.jpg","Pruebe estos deliciosos picarones","postre",123));
        platillo.add( new Platillo(27,"Arroz con leche","http://res.cloudinary.com/jamacomida/image/upload/v1466009139/descarga_rjvwfo.jpg","Pruebe este delicioso arroz con leche","postre",123));
        platillo.add( new Platillo(28,"Suspiro a la limeña","http://res.cloudinary.com/jamacomida/image/upload/v1466009139/descarga_1_fjdg87.jpg","Pruebe este delicioso suspiro a la limeña","postre",123));
        platillo.add( new Platillo(29,"Mazamorra morada","http://res.cloudinary.com/jamacomida/image/upload/v1466009139/descarga_2_ayurek.jpg","Pruebe esta deliciosa mazamorra morada","postre",123));
        platillo.add( new Platillo(30,"Turrón","http://res.cloudinary.com/jamacomida/image/upload/v1466009139/descarga_3_elhvuz.jpg","Pruebe este delicioso turrón","postre",123));
    }


    public List<Platillo> getPlatillo() {
        return platillo;
    }

    public void setPlatillo(List<Platillo> platillo) {
        this.platillo = platillo;
    }
}