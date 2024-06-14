package usuarios;

import controladores.MiembroService;

public class TestMiembro {
    public static void main(String[] args) {
        Miembro miembro2 = new Miembro();
        MiembroService miembroService = new MiembroService();

        miembroService.crearMiembro(miembro2);



    }
}
