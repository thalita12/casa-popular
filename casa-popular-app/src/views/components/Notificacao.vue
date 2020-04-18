<template>
    <v-snackbar v-model="exibir" :color="tipo" right top>
        {{ mensagem }}
        <v-btn dark flat @click="show = false">
            <v-icon small>close</v-icon>
        </v-btn>
    </v-snackbar>
</template>

<script>
    export default {
        name: 'Notificacao',
        data() {
            return {
                exibir: false,
                mensagem: '',
                tipo: ''
            }
        },
        created: function() {
            this.$store.watch(
                state => state.notificacao,
                () => {
                    const alert = this.$store.state.notificacao
                    if (alert.message !== '') {
                        this.exibir = true
                        this.mensagem = alert.mensagem
                        this.color = alert.tipo
                    }
                }
            )
        }
    }
</script>

<style scoped lang="scss">

</style>