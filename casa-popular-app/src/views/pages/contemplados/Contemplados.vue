<template>
    <div>
        <h1>Lista de famílias contempladas</h1>

        <v-data-table
                :headers="headers"
                :items="resultado"
                :items-per-page="10"/>
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
                        value: 'fat',
                        align: 'left'
                    },
                    {
                        text: 'Pontuação Total',
                        value: 'fat',
                        align: 'left'
                    },
                    {
                        text: 'Data Seleção',
                        value: 'fat',
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
                    const {data} = await this.$store.dispatch(actionTypes.BUSCAR_FAMILIAS_CONTEMPLADAS)
                    this.resultado = data.lista
                } catch (e) {
                    this.mostrarNotificacaoErro()
                }
            }
        }
    }
</script>

<style scoped lang="scss">

</style>