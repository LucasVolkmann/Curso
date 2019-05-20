package exemplo01;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("00");
		LocalDateTime momento = LocalDateTime.now();
		String S="",Sdia="",Smes="",Sano="",Shora="",Sminuto="",Ssegundo="";	
		int anoVar=0;
		int dia = momento.getDayOfMonth();
		int mes = momento.getMonthValue();
		int ano = momento.getYear();
		int hora = momento.getHour();
		int minutos = momento.getMinute();
//			DIA
			if(dia==1) {
				Sdia="um";
			}else if(dia==2) {
				Sdia="dois";
			}else if(dia==3) {
				Sdia="três";
			}else if(dia==4) {
				Sdia="quatro";
			}else if(dia==5) {
				Sdia="cinco";
			}else if(dia==6) {
				Sdia="seis";
			}else if(dia==7) {
				Sdia="sete";
			}else if(dia==8) {
				Sdia="oito";
			}else if(dia==9) {
				Sdia="nove";
			}else if(dia==10) {
				Sdia="dez";
			}else if(dia==11) {
				Sdia="onze";
			}else if(dia==12) {
				Sdia="doze";
			}else if(dia==13) {
				Sdia="treze";
			}else if(dia==14) {
				Sdia="quatorze";
			}else if(dia==15) {
				Sdia="quinze";
			}else if(dia==16) {
				Sdia="dezesseis";
			}else if(dia==17) {
				Sdia="dezessete";
			}else if(dia==18) {
				Sdia="dezoito";
			}else if(dia==19) {
				Sdia="dezenove";
			}else if(dia==20) {
				Sdia="vinte";
			}else if(dia==21) {
				Sdia="vinte e um";
			}else if(dia==22) {
				Sdia="vinte e dois";
			}else if(dia==23) {
				Sdia="vinte e três";
			}else if(dia==24) {
				Sdia="vinte e quatro";
			}else if(dia==25) {
				Sdia="vinte e cinco";
			}else if(dia==26) {
				Sdia="vinte e seis";
			}else if(dia==27) {
				Sdia="vinte e sete";
			}else if(dia==28) {
				Sdia="vinte e oito";
			}else if(dia==29) {
				Sdia="vinte e nove";
			}else if(dia==30) {
				Sdia="trinta";
			}else if(dia==31) {
				Sdia="trinta e um";
			}
//			MÊS
			if(mes==1) {
				Smes="janeiro";
			}else if(mes==2) {
				Smes="fevereiro";
			}else if(mes==3) {
				Smes="março";
			}else if(mes==4) {
				Smes="abril";
			}else if(mes==5) {
				Smes="maio";
			}else if(mes==6) {
				Smes="junho";
			}else if(mes==7) {
				Smes="julho";
			}else if(mes==8) {
				Smes="agosto";
			}else if(mes==9) {
				Smes="setembro";
			}else if(mes==10) {
				Smes="outubro";
			}else if(mes==11) {
				Smes="novembro";
			}else if(mes==12) {
				Smes="dezembro";
			}
//			ANO
			if(ano<2100) {
				anoVar=ano-2000;
				Sano="dois mil ";
			}else if(ano<2200) {
				anoVar=ano=2100;
				Sano="dois mil cento ";
			}else if(ano<2300) {
				anoVar=ano-2200;
				Sano="dois mil duzentos ";
			}
			if(anoVar==1) {
				Sano+="e um.";
			}else if(anoVar==2) {
				Sano+="e dois.";
			}else if(anoVar==3) {
				Sano+="e três.";
			}else if(anoVar==4) {
				Sano+="e quatro.";
			}else if(anoVar==5) {
				Sano+="e cinco.";
			}else if(anoVar==6) {
				Sano+="e seis.";
			}else if(anoVar==7) {
				Sano+="e sete.";
			}else if(anoVar==8) {
				Sano+="e oito.";
			}else if(anoVar==9) {
				Sano+="e nove.";
			}else if(anoVar==10) {
				Sano+="e dez.";
			}else if(anoVar==11) {
				Sano+="e onze.";
			}else if(anoVar==12) {
				Sano+="e doze.";
			}else if(anoVar==13) {
				Sano+="e treze.";
			}else if(anoVar==14) {
				Sano+="e quatorze.";
			}else if(anoVar==15) {
				Sano+="e quinze.";
			}else if(anoVar==16) {
				Sano+="e dezesseis.";
			}else if(anoVar==17) {
				Sano+="e dezessete.";
			}else if(anoVar==18) {
				Sano+="e dezoito.";
			}else if(anoVar==19) {
				Sano+="e dezenove.";
			}else if(anoVar==20) {
				Sano+="e vinte.";
			}else if(anoVar==21) {
				Sano+="e vinte e um.";
			}else if(anoVar==22) {
				Sano+="e vinte e dois.";
			}else if(anoVar==23) {
				Sano+="e vinte e três.";
			}else if(anoVar==24) {
				Sano+="e vinte e quatro.";
			}
//			HORA
			if(hora==1) {
				Shora="uma hora";
			}else if(hora==2) {
				Shora="duas horas";
			}else if(hora==3) {
				Shora="três horas";
			}else if(hora==4) {
				Shora="quatro horas";
			}else if(hora==5) {
				Shora="cinco horas";
			}else if(hora==6) {
				Shora="seis horas";
			}else if(hora==7) {
				Shora="sete horas";
			}else if(hora==8) {
				Shora="oito horas";
			}else if(hora==9) {
				Shora="nove horas";
			}else if(hora==10) {
				Shora="dez horas";
			}else if(hora==11) {
				Shora="onze horas";
			}else if(hora==12) {
				Shora="doze horas";
			}else if(hora==13) {
				Shora="treze horas";
			}else if(hora==14) {
				Shora="quatorze horas";
			}else if(hora==15) {
				Shora="quinze horas";
			}else if(hora==16) {
				Shora="dezesseis horas";
			}else if(hora==17) {
				Shora="dezessete horas";
			}else if(hora==18) {
				Shora="dezoito horas";
			}else if(hora==19) {
				Shora="dezenove horas";
			}else if(hora==20) {
				Shora="vinte horas";
			}else if(hora==21) {
				Shora="vinte e uma horas";
			}else if(hora==22) {
				Shora="vinte e dois horas";
			}else if(hora==23) {
				Shora="vinte e três horas";
			}else if(hora==24) {
				Shora="vinte e quatro horas";
//			MINUTOS
			}
			if(minutos==0) {
				Sminuto="zero minutos";
			}else if(minutos==1){
				Sminuto="um minuto";
			}else if(minutos==2){
				Sminuto="dois minutos";
			}else if(minutos==3){
				Sminuto="três minutos";
			}else if(minutos==4){
				Sminuto="quatro minutos";
			}else if(minutos==5){
				Sminuto="cinco minutos";
			}else if(minutos==6){
				Sminuto="seis minutos";
			}else if(minutos==7){
				Sminuto="sete minutos";
			}else if(minutos==8){
				Sminuto="oito minutos";
			}else if(minutos==9){
				Sminuto="nove minutos";
			}else if(minutos==10){
				Sminuto="dez minutos";
			}else if(minutos==11){
				Sminuto="onze minutos";
			}else if(minutos==12){
				Sminuto="doze minutos";
			}else if(minutos==13){
				Sminuto="treze minutos";
			}else if(minutos==14){
				Sminuto="quatorze minutos";
			}else if(minutos==15){
				Sminuto="quinze minutos";
			}else if(minutos==16){
				Sminuto="dezesseis minutos";
			}else if(minutos==17){
				Sminuto="dezessete minutos";
			}else if(minutos==18){
				Sminuto="dezoito minutos";
			}else if(minutos==19){
				Sminuto="dezenove minutos";
			}else if(minutos==20){
				Sminuto="vinte minutos";
			}else if(minutos==21){
				Sminuto="vinte e um minutos";
			}else if(minutos==22){
				Sminuto="vinte e dois minutos";
			}else if(minutos==23){
				Sminuto="vinte e três minutos";
			}else if(minutos==24){
				Sminuto="vinte e quatro minutos";
			}else if(minutos==25){
				Sminuto="vinte e cinco minutos";
			}else if(minutos==26){
				Sminuto="vinte e seis minutos";
			}else if(minutos==27){
				Sminuto="vinte e sete minutos";
			}else if(minutos==28){
				Sminuto="vinte e oito minutos";
			}else if(minutos==29){
				Sminuto="vinte e nove minutos";
			}else if(minutos==30){
				Sminuto="trinta minutos";
			}else if(minutos==31){
				Sminuto="tinta e um minutos";
			}else if(minutos==32){
				Sminuto="trinta e dois minutos";
			}else if(minutos==33){
				Sminuto="trinta e três minutos";
			}else if(minutos==34){
				Sminuto="trinta e quatro minutos";
			}else if(minutos==35){
				Sminuto="trinta e cinco minutos";
			}else if(minutos==36){
				Sminuto="trinta e seis minutos";
			}else if(minutos==37){
				Sminuto="trinta e sete minutos";
			}else if(minutos==38){
				Sminuto="trinta e oito minutos";
			}else if(minutos==39){
				Sminuto="trinta e nove minutos";
			}else if(minutos==40){
				Sminuto="quarenta minutos";
			}else if(minutos==41){
				Sminuto="quarenta e um minutos";
			}else if(minutos==42){
				Sminuto="quarenta e dois minutos";
			}else if(minutos==43){
				Sminuto="quarenta e três minutos";
			}else if(minutos==44){
				Sminuto="quarenta e quatro minutos";
			}else if(minutos==45){
				Sminuto="quarenta e cinco minutos";
			}else if(minutos==46){
				Sminuto="quarenta e seis minutos";
			}else if(minutos==47){
				Sminuto="quarenta e sete minutos";
			}else if(minutos==48){
				Sminuto="quarenta e oito minutos";
			}else if(minutos==49){
				Sminuto="quarenta e nove minutos";
			}else if(minutos==50){
				Sminuto="cinquenta minutos";
			}else if(minutos==51){
				Sminuto="cinquenta e um minutos";
			}else if(minutos==52){
				Sminuto="cinquenta e dois minutos";
			}else if(minutos==53){
				Sminuto="cinquenta e três minutos";
			}else if(minutos==54){
				Sminuto="cinquenta e quatro minutos";
			}else if(minutos==55){
				Sminuto="cinquenta e cinco minutos";
			}else if(minutos==56){
				Sminuto="cinquenta e seis minutos";
			}else if(minutos==57){
				Sminuto="cinquenta e sete minutos";
			}else if(minutos==58){
				Sminuto="cinquenta e oito minutos";
			}else if(minutos==59){
				Sminuto="cinquenta e nove minutos";
			}
			JOptionPane.showMessageDialog(null, df.format(dia)+"/"+df.format(mes)+"/"+df.format(ano)+"  -  "+df.format(hora)+":"+df.format(minutos)
											+"\n Hoje é dia "+Sdia+" de "+Smes+" de "+Sano
											+"\n A Hora atual é "+Shora+" e "+Sminuto);
	}

}
