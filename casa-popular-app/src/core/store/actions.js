import axios from 'axios'
import {actionTypes} from '@/core/constants'

export default {

    async [actionTypes.BUSCAR_FAMILIAS_APTAS]() {
        // return await axios.get(`/familias-aptas`)
        return new Promise((resolve) => {
            resolve({
                data: {
                    lista: [
                        {
                            id: 1,
                            nomePretendente: 'Thalita Oliveira',
                            rendaTotal: 1950.0,
                            pontuacao: 15
                        },
                        {
                            id: 2,
                            nomePretendente: 'Jeferson Urbieta',
                            rendaTotal: 2950.0,
                            pontuacao: 10
                        }
                    ]
                }
            })
        })
    },

    async [actionTypes.BUSCAR_FAMILIAS_CONTEMPLADAS]() {
        return await axios.get(`/familias-contempladas`)
    }

}
