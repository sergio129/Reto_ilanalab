package Utilities;

import Model.LinksModel;
import Model.PracticeFormModel;


import java.util.ResourceBundle;

public class Leerdatos {
    public static ResourceBundle resourceBundle() {
        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {
            return ResourceBundle.getBundle("Datos_pruebas.Datos");
        }
    }

    public static String getTestLeerDatos(String llave) {
        return resourceBundle().getString(llave);
    }


    public static PracticeFormModel datosForm() {
        PracticeFormModel modeform = new PracticeFormModel();
        modeform.setFirstName(Leerdatos.getTestLeerDatos("demoqa.FirstName"));
        modeform.setLastName(Leerdatos.getTestLeerDatos("demoqa.LastName"));
        modeform.setEmail(Leerdatos.getTestLeerDatos("demoqa.Email"));
        modeform.setGender(Leerdatos.getTestLeerDatos("demoqa.Gender"));
        modeform.setMobile(Leerdatos.getTestLeerDatos("demoqa.Mobile"));
        modeform.setVerification(Leerdatos.getTestLeerDatos("demoqa.Verfificacion"));
        return modeform;
    }

    public static LinksModel datoslink() {
        LinksModel linksModel = new LinksModel();
        linksModel.setCreated(Leerdatos.getTestLeerDatos("demoqa.Created"));
        linksModel.setNoContent(Leerdatos.getTestLeerDatos("demoqa.No_Content"));
        linksModel.setMoved(Leerdatos.getTestLeerDatos("demoqa.Moved"));
        linksModel.setBadRequest(Leerdatos.getTestLeerDatos("demoqa.Bad_Request"));
        linksModel.setUnauthorized(Leerdatos.getTestLeerDatos("demoqa.Unauthorized"));
        linksModel.setForbidden(Leerdatos.getTestLeerDatos("demoqa.Forbidden"));
        linksModel.setNotFound(Leerdatos.getTestLeerDatos("demoqa.Not_Found"));
        return linksModel;
    }
}
