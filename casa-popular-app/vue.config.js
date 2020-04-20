module.exports = {
    devServer: {
        open: process.platform === 'darwin',
        host: '0.0.0.0',
        port: 3000,
        https: false,
        hotOnly: false,
        proxy: {
            '/api/*': {
                target: 'http://localhost:8080',
                secure: false,
                changeOrigin: true,
                ws: true
            }
        }
    },
    transpileDependencies: [
        /\bvue-awesome\b/
    ]
}
