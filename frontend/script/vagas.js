 new Vue({
	el: '#app',
	data() {
		return {
			//local onde serão armazenadas as informações da API
			info: [],
			localizacao: null
		}
	},
	methods: {
		//retorna as vagas ativas
		ativa: function(lista){
			return lista.filter(vaga => vaga.ativa);
		},
		//retorna a localização como remota se não possuir nada
		local: function(lista) {
			const a = this.ativa(lista);
			const l = "Remoto";
			if (a.localizacao === undefined) {
				a.localizacao = l;
			}
			this.localizacao=a.localizacao;
			return a;
		}
	},
	//pega as informações da API utilizando o axios já com os dados tratados
	mounted() {
		axios
			.get('http://www.mocky.io/v2/5d6fb6b1310000f89166087b')
			.then(response => (this.info = this.local(response.data.vagas)))
	},
	created(){
		//aponta para as instâncias criadas
		this.info;
		this.localizacao;
	}
})

