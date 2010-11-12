package br.com.webgoal.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Web_escolhe implements EntryPoint {

	private final HTML titulo = new HTML("<h1>Web Escolhe</h1>");
	private final Button escolheButton = new Button("ESCOLHER");
	private final VerticalPanel verticalPanel = new VerticalPanel();

	private final Label nomeLabel = new Label("Nome:");
	private final TextBox nomeTextBox = new TextBox();
	private final Label comidaLabel = new Label("Comida:");
	private final TextBox comidaTextBox = new TextBox();
	private final Button addButton = new Button("Add");

	public void onModuleLoad() {

		RootPanel.get("webEscolheContainer").add(montaTopoPanel());
				
		RootPanel.get("formularioContainer").add(montaAdicionarPanel());
		
		final FlexTable flexTable = new FlexTable();	
		RootPanel.get("escolhasContainer").add(flexTable);
		
		nomeTextBox.setFocus(true);
		
		
		// Add a handler to close the DialogBox
		addButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String nome = nomeTextBox.getText();
				String comida = comidaTextBox.getText();
				if(validarFormulario(nome, comida)){
					int ultimalinha = flexTable.getRowCount();
					flexTable.setText(ultimalinha, 0, nome);
					flexTable.setText(ultimalinha, 1, comida);
					nomeTextBox.setText(null);
					comidaTextBox.setText(null);
					nomeTextBox.setFocus(true);
				}
			}
		});
		
		escolheButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				int numeroLinhas = flexTable.getRowCount();
				if(numeroLinhas == 0){
					Window.alert("Favor informar opções do prato desejado!");
				} else{
					int escolhaSorteada = Random.nextInt(numeroLinhas);
					flexTable.getRowFormatter().setStyleName(escolhaSorteada, "escolhida");
					
					escolheButton.setEnabled(false);
					escolheButton.addStyleName("disabled");	
				}
			}
		});
		
	}

	private Widget montaTopoPanel() {
		verticalPanel.add(titulo);
		verticalPanel.add(escolheButton);
		
		return verticalPanel;
	}

	private HorizontalPanel montaAdicionarPanel() {
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		
		horizontalPanel.add(nomeLabel);
		horizontalPanel.add(nomeTextBox);
		horizontalPanel.add(comidaLabel);
		horizontalPanel.add(comidaTextBox);
		horizontalPanel.add(addButton);
		
		return horizontalPanel;
	}
	
	public boolean validarFormulario(String nome, String comida){
		if (nome.isEmpty() || comida.isEmpty()) {
			Window.alert("Por favor informe o nome e a comida desejada!");
			return false;
		}
		return true;
	}
}
