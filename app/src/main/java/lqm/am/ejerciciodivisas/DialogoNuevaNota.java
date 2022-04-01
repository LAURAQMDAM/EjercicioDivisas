package lqm.am.ejerciciodivisas;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class DialogoNuevaNota extends DialogFragment {

    ImageView imgObliga,imgFun,imgInteresting;
    EditText dialogoTxt ;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {


        //construir una alert con el constructor Builder
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //solicitamos el inflador
        LayoutInflater inflater = getActivity().getLayoutInflater();

        //inflamos el dialogo con el layout  dialogo_nueva_nota.xml
       // View dialogView = inflater.inflate(R.layout.dialog_nueva_nota,null);
        View dialogView = inflater.inflate(R.layout.dialogo_mostrar_pulsado_plus,null);

        //dialogoTxt = dialogoTxt.findViewById(R.id.dialogo);

        Button btnOk=dialogView.findViewById(R.id.btnOk);
        builder.setView(dialogView).setMessage("Su calculo de IMC corresponde a: ");
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });


        //una vez configurada la alerta, le indicamos al builder que debe crearla
        return builder.create();
    }
}
