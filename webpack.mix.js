const mix = require('laravel-mix')

mix.js('frontend/static/app.js', 'static/js').setPublicPath('frontend/dist');
