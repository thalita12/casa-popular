<template>
    <div class="contemplados">
        <h1 class="contemplados__titulo">Lista de famílias contempladas</h1>

        <v-data-table
                :headers="headers"
                :items="resultado"
                :items-per-page="10"
                no-results-text="Nenhuma família encontrada"/>
    </div>
</template>

<script>
    import {actionTypes} from '@/core/constants'

    export default {
        name: 'Contemplados',
        data () {
            return {
                headers: [
                    {
                        text: 'Nº',
                        value: 'id',
                        align: 'left'
                    },                    {
                        text: 'Família',
                        value: 'calories',
                        align: 'left'
                    },
                    {
                        text: 'Qtd Critérios',
                        value: 'criteriosAtendidos',
                        align: 'left'
                    },
                    {
                        text: 'Pontuação Total',
                        value: 'pontos',
                        align: 'left'
                    },
                    {
                        text: 'Data Seleção',
                        value: 'dataDeSelecao',
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
                    this.resultado = await this.$store.dispatch(actionTypes.BUSCAR_FAMILIAS_CONTEMPLADAS)
                } catch (e) {
                    this.mostrarNotificacaoErro()
                }
            }
        }
    }
</script>

<style scoped lang="scss">
    .contemplados {
        width: 100%;
        padding: 20px;

        &__titulo {
            font-size: 24px;
            margin-bottom: 20px;
            text-align: left;
        }
    }
</style>