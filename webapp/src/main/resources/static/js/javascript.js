function masquer(id, prenom){
	//document.getElementById(id).src="../img/dos.PNG";
	var element = document.getElementById(id).src;
	var titre= "#"+id+"titre"
	if(element.includes(prenom)){
		document.getElementById(id).src="../img/dos.PNG";
		document.getElementById(id+"couleur").classList.remove('bg-primary');
		document.getElementById(id+"couleur").classList.add('bg-danger');
	}else{
		var imgString = "../img/" + prenom + ".PNG"
		document.getElementById(id).src=imgString;
		document.getElementById(id+"couleur").classList.remove('bg-danger');
		document.getElementById(id+"couleur").classList.add('bg-primary');
	}
	
		
	
}
