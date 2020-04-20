<template>
  <div class="familias-aptas">
    <h1 class="familias-aptas__titulo">Famílias aptas para receberem a casa popular</h1>

    <v-data-table
            :headers="headers"
            :items="resultado"
            :items-per-page="10"
            no-results-text="Nenhuma família encontrada"
            class="elevation-1"/>
  </div>
</template>

<script>
  import {actionTypes} from '@/core/constants'

  export default {
    name: 'FamiliasAptas',
    data () {
      return {
        headers: [
          {
            text: 'Pontuação',
            align: 'left',
            sortable: true,
            value: 'pontos'
          },
          {
            text: 'Família',
            value: 'nomePretendente',
            align: 'left'
          },
          {
            text: 'Renda Total',
            value: 'rendaTotal',
            align: 'left'
          }
        ],
        resultado: []
      }
    },
    async mounted() {
      try {
        await this.buscar()
      } catch (e) {
        this.mostrarNotificacaoErroDefault()
      }
    },
    methods: {
      async buscar() {
        try {
          this.resultado = await this.$store.dispatch(actionTypes.BUSCAR_FAMILIAS_APTAS)
        } catch (e) {
          this.mostrarNotificacaoErro()
        }
      }
    }
  }
</script>

<style scoped lang="scss">
  .familias-aptas {
    width: 100%;
    padding: 20px;

    &__titulo {
      font-size: 24px;
      margin-bottom: 20px;
      text-align: left;
    }
  }
</style>