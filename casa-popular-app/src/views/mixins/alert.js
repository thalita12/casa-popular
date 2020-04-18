import {mutationTypes, notificacoes} from '@/core/constants'

export default {
    methods: {
        mostrarNotificacaoErro(mensagem) {
            this.$store.commit(mutationTypes.SET_EXIBIR_NOTIFICACAO, {
                mensagem,
                tipo: 'error'
            })
        },
        mostrarNotificacaoErroDefault() {
            this.$store.commit(mutationTypes.SET_EXIBIR_NOTIFICACAO, {
                mensagem: notificacoes.ERRO_DEFAULT,
                tipo: 'error'
            })
        },
        mostrarNotificacaoSucesso(mensagem) {
            this.$store.commit(mutationTypes.SET_EXIBIR_NOTIFICACAO, {
                mensagem,
                tipo: 'success'
            })
        },
        mostrarNotificacaoSucessoDefault() {
            this.$store.commit(mutationTypes.SET_EXIBIR_NOTIFICACAO, {
                mensagem: notificacoes.SUCESSO_DEFAULT,
                tipo: 'success'
            })
        }
    }
}
