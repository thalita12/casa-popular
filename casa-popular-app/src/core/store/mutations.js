import {mutationTypes} from '@/core/constants'

export default {

    [mutationTypes.SET_EXIBIR_NOTIFICACAO](state, notificacao) {
        state.notificacao = notificacao
    }

}
