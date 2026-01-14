
import BusinessLogic.Entities.HLarva;
import BusinessLogic.Entities.Hormiga;
import BusinessLogic.FactoryBL;
import DataAccess.DAOs.AntCiberDronDAO;
import DataAccess.DTOs.AntCiberDronDTO;



//  © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code

public class App {
    public static void main(String[] args)   {

        //TEST BL
        try {
            HLarva l = new HLarva();
            System.out.println( l.getLava(1).toString() );
            Hormiga h = l.comer("hierva");
            System.out.println( h.toString() );



            //generic BL
            // FactoryBL<AntCiberDronDTO> bl = new FactoryBL<>(AntCiberDronDAO.class);

            // for (int i = 1; i <= bl.getAll().size(); i++) {
            //     AntCiberDronDTO oDTO = bl.getBy(i);
            //     oDTO.setSerie("Serie-BL" + i);
            //     bl.upd(oDTO);
            // }

            // for (var dto : bl.getAll()) {
            //     System.out.println(dto.toString());
            // }
        } catch (Exception e) {
        }

        // try {
        //     AntCiberDronDAO dao = new AntCiberDronDAO();

        //     for (int i = 1; i <= dao.readAll().size(); i++) {
        //         AntCiberDronDTO oDTO =  dao.readBy(i);
        //         oDTO.setSerie("Serie-002" + i);
        //          dao.update(oDTO);
        //     }

        //     // AntCiberDronDTO oDTO =  dao.readBy(2);
        //     // oDTO.setSerie("Serie-002");
        //     // dao.update(oDTO);

        //     for ( var dto : dao.readAll() ) {           //var es lo que infiere el tipo de dato
        //         System.out.println( dto.toString() );
        //     }

        // } catch (Exception e) {}


        // try {

        //     HLarva l = new HLarva();
        //     System.out.println( l.getLava(1).getNombre() );

        //     for ( var larva : l.getLarvas() ) {
        //         System.out.println( larva.toString() );
        //     }
        // } catch (Exception e) {
        // }


        // try {

        //     HormigaDAO dao = new HormigaDAO();
        //     for (VWHormigaDTO h : dao.readAllvwHormiga()) {
        //         System.out.println( h.toString() );
        //     }

        // } catch (Exception e) {
        // }

        // try {

        //     AlimentoTipoDAO dao = new AlimentoTipoDAO();
        //     AlimentoTipoDTO oDTO = dao.readBy(1);
        //     oDTO.setNombre("CARnivoro");
        //     oDTO.setDescripcion("Salado");
        //     dao.update(oDTO);
        //     //si quisiera eliminar algun registro
        //     //dao.deleteBy(3);    


        //     for (AlimentoTipoDTO dto : dao.readAll())
        //         System.out.println( dto.toString() );

        // } catch (AppException _) {}

        
         
        // Prueba Excepciones 

        // int a =10;
        // int b =0;
        // try {
        //     a= a / b;
        // } catch (Exception e) {
        //     AppException er = new AppException("Error al dividir por cero", e, null, "main(...)" );
        //     AppMSG.showError(er.getMessage());
        //     // Para burbujear el error original se utiliza throw e;
        // }
        // System.out.println("Final Feliz...");

        // Fin Prueba Excepciones

        
        // SistemaRuso sistemaRuso = new SistemaRuso();
        // try {   
        //     sistemaRuso.readCoord("datafile\\pat_mic.csv");

        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // Automata automata = new Automata();
        // Scanner tipoArsenal = new Scanner("a ,ab ,abc ,abcd ").useDelimiter(",");

        // while (tipoArsenal.hasNext()) 
        //     System.out.println( automata.checkTipoArsenal(tipoArsenal.next()) ?  "OK" : "Error" ) ;
        // tipoArsenal.close();
    }
}