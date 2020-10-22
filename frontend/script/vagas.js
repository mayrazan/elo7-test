 new Vue({
	el: '#app',
	data() {
		return {
			info: [],
			localizacao: null
		}
	},
	methods: {
		ativa: function(lista){
			return lista.filter(vaga => vaga.ativa);
		},
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
	mounted() {
		axios
			.get('http://www.mocky.io/v2/5d6fb6b1310000f89166087b')
			.then(response => (this.info = this.local(response.data.vagas)))
	},
	created(){
		this.info;
		this.localizacao;
	}
})

