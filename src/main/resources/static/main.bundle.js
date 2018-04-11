webpackJsonp(["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/account-info/account-info.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/account-info/account-info.component.html":
/***/ (function(module, exports) {

module.exports = "<ng-container *ngIf=\"jwtService.checkToken()\">\n<mat-card class=\"example-card\">\n  <mat-card-header>\n    <div mat-card-avatar class=\"example-header-image\"></div>\n    <mat-card-title>Shiba Inu</mat-card-title>\n    <mat-card-subtitle>Dog Breed</mat-card-subtitle>\n  </mat-card-header>\n  <img mat-card-image src=\"https://material.angular.io/assets/img/examples/shiba2.jpg\" alt=\"Photo of a Shiba Inu\">\n  <mat-card-content>\n    <p>\n      The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes\n      very well with mountainous terrain, the Shiba Inu was originally bred for hunting.\n    </p>\n  </mat-card-content>\n  <mat-card-actions>\n    <button mat-button>LIKE</button>\n    <button mat-button>SHARE</button>\n  </mat-card-actions>\n</mat-card>\n</ng-container>"

/***/ }),

/***/ "./src/app/account-info/account-info.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AccountInfoComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__jwt_service__ = __webpack_require__("./src/app/jwt.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AccountInfoComponent = /** @class */ (function () {
    function AccountInfoComponent(jwtService) {
        this.jwtService = jwtService;
    }
    AccountInfoComponent.prototype.ngOnInit = function () {
    };
    AccountInfoComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-account-info',
            template: __webpack_require__("./src/app/account-info/account-info.component.html"),
            styles: [__webpack_require__("./src/app/account-info/account-info.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__jwt_service__["a" /* JwtService */]])
    ], AccountInfoComponent);
    return AccountInfoComponent;
}());



/***/ }),

/***/ "./src/app/app-routing.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppRoutingModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common__ = __webpack_require__("./node_modules/@angular/common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__car_enterance_car_enterance_component__ = __webpack_require__("./src/app/car-enterance/car-enterance.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__index_page_index_page_component__ = __webpack_require__("./src/app/index-page/index-page.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__account_info_account_info_component__ = __webpack_require__("./src/app/account-info/account-info.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__cdk_table_basic_example_cdk_table_basic_example_component__ = __webpack_require__("./src/app/cdk-table-basic-example/cdk-table-basic-example.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__order_submit_order_submit_component__ = __webpack_require__("./src/app/order-submit/order-submit.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__staff_work_list_staff_work_list_component__ = __webpack_require__("./src/app/staff-work-list/staff-work-list.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__cashier_board_cashier_board_component__ = __webpack_require__("./src/app/cashier-board/cashier-board.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};










var routes = [
    // { path: '', redirectTo: '/home', pathMatch: 'full' },
    { path: '', component: __WEBPACK_IMPORTED_MODULE_4__index_page_index_page_component__["a" /* IndexPageComponent */] },
    { path: 'home', component: __WEBPACK_IMPORTED_MODULE_4__index_page_index_page_component__["a" /* IndexPageComponent */] },
    { path: 'me', component: __WEBPACK_IMPORTED_MODULE_5__account_info_account_info_component__["a" /* AccountInfoComponent */] },
    { path: 'carEnterance', component: __WEBPACK_IMPORTED_MODULE_3__car_enterance_car_enterance_component__["a" /* CarEnteranceComponent */] },
    { path: 'table', component: __WEBPACK_IMPORTED_MODULE_6__cdk_table_basic_example_cdk_table_basic_example_component__["a" /* CdkTableBasicExampleComponent */] },
    { path: 'orderSubmit', component: __WEBPACK_IMPORTED_MODULE_7__order_submit_order_submit_component__["a" /* OrderSubmitComponent */] },
    { path: 'cashier-board', component: __WEBPACK_IMPORTED_MODULE_9__cashier_board_cashier_board_component__["a" /* CashierBoardComponent */] },
    { path: 'work-list', component: __WEBPACK_IMPORTED_MODULE_8__staff_work_list_staff_work_list_component__["a" /* StaffWorkListComponent */] }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["NgModule"])({
            imports: [
                __WEBPACK_IMPORTED_MODULE_1__angular_common__["CommonModule"],
                __WEBPACK_IMPORTED_MODULE_2__angular_router__["b" /* RouterModule */].forRoot(routes)
            ], exports: [
                __WEBPACK_IMPORTED_MODULE_2__angular_router__["b" /* RouterModule */]
            ],
            declarations: []
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/***/ (function(module, exports) {

module.exports = ".flex-spacer {\r\n    -webkit-box-flex: 1;\r\n        -ms-flex: 1 1 auto;\r\n            flex: 1 1 auto;\r\n}\r\n\r\n.example-container {\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-orient: vertical;\r\n    -webkit-box-direction: normal;\r\n        -ms-flex-direction: column;\r\n            flex-direction: column;\r\n    position: absolute;\r\n    top: 0;\r\n    bottom: 0;\r\n    left: 0;\r\n    right: 0;\r\n}\r\n\r\n.navContent {\r\n    margin-top: 56px;\r\n}\r\n\r\n#title {\r\n    outline: none;\r\n}\r\n\r\n#title p {\r\n    font-size: 10pt;\r\n    padding: 0;\r\n    margin: 0;\r\n}\r\n\r\n#menuButton {\r\n    color: black;\r\n    outline: none;\r\n    min-width: 50px;\r\n    padding: 0;\r\n}\r\n\r\n.example-sidenav-content {\r\n    /* margin-top: 64px; */\r\n    overflow: visible;\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    height: 100%;\r\n    /* align-items: center; */\r\n    -webkit-box-pack: center;\r\n        -ms-flex-pack: center;\r\n            justify-content: center;\r\n}\r\n\r\n.example-sidenav {\r\n    color: #fff;\r\n    min-width: 170px;\r\n    background-color: #3f51b5;\r\n    padding: 20px;\r\n}\r\n\r\n.toolbar {\r\n    /* box-shadow: 0 2px 10px #192048; */\r\n    z-index: 2;\r\n    position: fixed;\r\n}"

/***/ }),

/***/ "./src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "<ng-container>\n  <mat-toolbar class=\"toolbar mat-elevation-z6\" color=\"primary\">\n    <mat-toolbar-row  fxLayout=\"row\" fxLayoutAlign=\"start center\" fxLayoutGap=\"gappx\">\n      <div style=\"display:flex;\" fxFlexAlign=\"start center\">\n        <b >{{title}}</b>\n      </div>\n      <div class=\"flex-spacer\"></div>\n      <div fxFlexAlign=\"center center\">\n        <ng-container *ngIf=\"this.jwtService.checkToken(); else elseTemplate\">\n          <button id='menuButton' mat-raised-button [matMenuTriggerFor]=\"menu\">\n            <span>{{jwtService.getCurrentUser().username}}</span>\n          </button>\n          <mat-menu #menu=\"matMenu\">\n            <button routerLink='/me' mat-menu-item>\n              <mat-icon>notifications_off</mat-icon>\n              <span>我的信息</span>\n            </button>\n            <button mat-menu-item >\n              <mat-icon>voicemail</mat-icon>\n              <span>我的订单</span>\n            </button>\n            <button routerLink='/work-list' mat-menu-item >\n              <mat-icon>voicemail</mat-icon>\n              <span>我的工单</span>\n            </button>\n            <button (click)='logout()' mat-menu-item>\n              <mat-icon>exit_to_app</mat-icon>\n              <span>退出登录</span>\n            </button>\n\n\n          </mat-menu>\n\n        </ng-container>\n        <ng-template #elseTemplate>\n          <button mat-button (click)=\"loginDialog()\">\n            <span>登录/注册</span>\n            <mat-icon class=\"example-icon\">person_pin</mat-icon>\n          </button>\n        </ng-template>\n\n\n      </div>\n    </mat-toolbar-row>\n  </mat-toolbar>\n</ng-container>\n<app-slide-nav></app-slide-nav>"

/***/ }),

/***/ "./src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__("./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__login_dialog_login_dialog_component__ = __webpack_require__("./src/app/login-dialog/login-dialog.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__jwt_service__ = __webpack_require__("./src/app/jwt.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__message_dialog_service__ = __webpack_require__("./src/app/message-dialog.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var AppComponent = /** @class */ (function () {
    function AppComponent(messageService, router, dialog, jwtService) {
        this.messageService = messageService;
        this.router = router;
        this.dialog = dialog;
        this.jwtService = jwtService;
        this.title = '易车服';
        router.onSameUrlNavigation = 'reload';
    }
    AppComponent.prototype.ngOnDestory = function () {
    };
    AppComponent.prototype.loginDialog = function () {
        this.dialog.open(__WEBPACK_IMPORTED_MODULE_2__login_dialog_login_dialog_component__["a" /* LoginDialogComponent */], {
            width: '500px'
        });
    };
    AppComponent.prototype.logout = function () {
        this.jwtService.logout();
        this.messageService.showMessage('消息', '你已注销');
        this.router.navigate(['/home']);
    };
    AppComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-root',
            template: __webpack_require__("./src/app/app.component.html"),
            styles: [__webpack_require__("./src/app/app.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_5__message_dialog_service__["a" /* MessageDialogService */],
            __WEBPACK_IMPORTED_MODULE_4__angular_router__["a" /* Router */],
            __WEBPACK_IMPORTED_MODULE_1__angular_material__["i" /* MatDialog */],
            __WEBPACK_IMPORTED_MODULE_3__jwt_service__["a" /* JwtService */]])
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__("./node_modules/@angular/platform-browser/esm5/platform-browser.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_flex_layout__ = __webpack_require__("./node_modules/@angular/flex-layout/esm5/flex-layout.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_platform_browser_animations__ = __webpack_require__("./node_modules/@angular/platform-browser/esm5/animations.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_material__ = __webpack_require__("./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_hammerjs__ = __webpack_require__("./node_modules/hammerjs/hammer.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_hammerjs___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_5_hammerjs__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_ng2_file_upload_file_upload_file_upload_module__ = __webpack_require__("./node_modules/ng2-file-upload/file-upload/file-upload.module.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_ng2_file_upload_file_upload_file_upload_module___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_6_ng2_file_upload_file_upload_file_upload_module__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__app_routing_module__ = __webpack_require__("./src/app/app-routing.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_ng2_image_compress__ = __webpack_require__("./node_modules/ng2-image-compress/ng2-image-compress.umd.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_ng2_image_compress___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_8_ng2_image_compress__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__ng_bootstrap_ng_bootstrap__ = __webpack_require__("./node_modules/@ng-bootstrap/ng-bootstrap/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__cdk_table_basic_example_cdk_table_basic_example_component__ = __webpack_require__("./src/app/cdk-table-basic-example/cdk-table-basic-example.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__angular_cdk_table__ = __webpack_require__("./node_modules/@angular/cdk/esm5/table.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__angular_common__ = __webpack_require__("./node_modules/@angular/common/esm5/common.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__app_component__ = __webpack_require__("./src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__login_dialog_login_dialog_component__ = __webpack_require__("./src/app/login-dialog/login-dialog.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__angular_forms__ = __webpack_require__("./node_modules/@angular/forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__jwt_service__ = __webpack_require__("./src/app/jwt.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__angular_common_http__ = __webpack_require__("./node_modules/@angular/common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__auth_module__ = __webpack_require__("./src/auth.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__car_enterance_car_enterance_component__ = __webpack_require__("./src/app/car-enterance/car-enterance.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__index_page_index_page_component__ = __webpack_require__("./src/app/index-page/index-page.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_21__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_22__auth_guard_service__ = __webpack_require__("./src/app/auth-guard.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_23__message_dialog_service__ = __webpack_require__("./src/app/message-dialog.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_24__message_dialog_message_dialog_component__ = __webpack_require__("./src/app/message-dialog/message-dialog.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_25__account_info_account_info_component__ = __webpack_require__("./src/app/account-info/account-info.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_26__product_retrieve_service__ = __webpack_require__("./src/app/product-retrieve.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_27__slide_nav_slide_nav_component__ = __webpack_require__("./src/app/slide-nav/slide-nav.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_28__order_submit_order_submit_component__ = __webpack_require__("./src/app/order-submit/order-submit.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_29__staff_work_list_staff_work_list_component__ = __webpack_require__("./src/app/staff-work-list/staff-work-list.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_30__cashier_board_cashier_board_component__ = __webpack_require__("./src/app/cashier-board/cashier-board.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
// Denpendency













// App


















var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["NgModule"])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_13__app_component__["a" /* AppComponent */],
                __WEBPACK_IMPORTED_MODULE_14__login_dialog_login_dialog_component__["a" /* LoginDialogComponent */],
                __WEBPACK_IMPORTED_MODULE_19__car_enterance_car_enterance_component__["a" /* CarEnteranceComponent */],
                __WEBPACK_IMPORTED_MODULE_20__index_page_index_page_component__["a" /* IndexPageComponent */],
                __WEBPACK_IMPORTED_MODULE_24__message_dialog_message_dialog_component__["a" /* MessageDialogComponent */],
                __WEBPACK_IMPORTED_MODULE_25__account_info_account_info_component__["a" /* AccountInfoComponent */],
                __WEBPACK_IMPORTED_MODULE_27__slide_nav_slide_nav_component__["a" /* SlideNavComponent */],
                __WEBPACK_IMPORTED_MODULE_10__cdk_table_basic_example_cdk_table_basic_example_component__["a" /* CdkTableBasicExampleComponent */],
                __WEBPACK_IMPORTED_MODULE_28__order_submit_order_submit_component__["a" /* OrderSubmitComponent */],
                __WEBPACK_IMPORTED_MODULE_29__staff_work_list_staff_work_list_component__["a" /* StaffWorkListComponent */],
                __WEBPACK_IMPORTED_MODULE_30__cashier_board_cashier_board_component__["a" /* CashierBoardComponent */],
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_15__angular_forms__["d" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_3__angular_platform_browser_animations__["a" /* BrowserAnimationsModule */],
                // http client
                __WEBPACK_IMPORTED_MODULE_21__angular_http__["HttpModule"],
                __WEBPACK_IMPORTED_MODULE_17__angular_common_http__["c" /* HttpClientModule */],
                __WEBPACK_IMPORTED_MODULE_17__angular_common_http__["b" /* HttpClientJsonpModule */],
                __WEBPACK_IMPORTED_MODULE_18__auth_module__["a" /* AuthModule */],
                __WEBPACK_IMPORTED_MODULE_6_ng2_file_upload_file_upload_file_upload_module__["FileUploadModule"],
                __WEBPACK_IMPORTED_MODULE_7__app_routing_module__["a" /* AppRoutingModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_flex_layout__["a" /* FlexLayoutModule */],
                // Materials module
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["b" /* MatAutocompleteModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["c" /* MatButtonModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["d" /* MatButtonToggleModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["e" /* MatCardModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["f" /* MatCheckboxModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["g" /* MatChipsModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["E" /* MatStepperModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["h" /* MatDatepickerModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["j" /* MatDialogModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["l" /* MatDividerModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["m" /* MatExpansionModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["n" /* MatGridListModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["o" /* MatIconModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["p" /* MatInputModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["q" /* MatListModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["r" /* MatMenuModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["s" /* MatNativeDateModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["t" /* MatPaginatorModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["u" /* MatProgressBarModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["v" /* MatProgressSpinnerModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["w" /* MatRadioModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["x" /* MatRippleModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["y" /* MatSelectModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["z" /* MatSidenavModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["B" /* MatSliderModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["A" /* MatSlideToggleModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["C" /* MatSnackBarModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["D" /* MatSortModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["F" /* MatTableModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["G" /* MatTabsModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["H" /* MatToolbarModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_material__["I" /* MatTooltipModule */],
                __WEBPACK_IMPORTED_MODULE_11__angular_cdk_table__["m" /* CdkTableModule */],
                __WEBPACK_IMPORTED_MODULE_15__angular_forms__["i" /* ReactiveFormsModule */],
                __WEBPACK_IMPORTED_MODULE_9__ng_bootstrap_ng_bootstrap__["a" /* NgbModule */].forRoot()
            ],
            entryComponents: [
                __WEBPACK_IMPORTED_MODULE_14__login_dialog_login_dialog_component__["a" /* LoginDialogComponent */],
                __WEBPACK_IMPORTED_MODULE_24__message_dialog_message_dialog_component__["a" /* MessageDialogComponent */]
            ],
            providers: [
                {
                    // 路由方式：/#/xxx
                    provide: __WEBPACK_IMPORTED_MODULE_12__angular_common__["LocationStrategy"],
                    useClass: __WEBPACK_IMPORTED_MODULE_12__angular_common__["HashLocationStrategy"]
                },
                __WEBPACK_IMPORTED_MODULE_16__jwt_service__["a" /* JwtService */],
                __WEBPACK_IMPORTED_MODULE_22__auth_guard_service__["a" /* AuthGuardService */],
                __WEBPACK_IMPORTED_MODULE_23__message_dialog_service__["a" /* MessageDialogService */],
                __WEBPACK_IMPORTED_MODULE_8_ng2_image_compress__["ImageCompressService"],
                __WEBPACK_IMPORTED_MODULE_8_ng2_image_compress__["ResizeOptions"],
                __WEBPACK_IMPORTED_MODULE_26__product_retrieve_service__["a" /* ProductRetrieveService */]
            ],
            bootstrap: [
                __WEBPACK_IMPORTED_MODULE_13__app_component__["a" /* AppComponent */],
            ]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/auth-guard.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AuthGuardService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__jwt_service__ = __webpack_require__("./src/app/jwt.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__message_dialog_service__ = __webpack_require__("./src/app/message-dialog.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var AuthGuardService = /** @class */ (function () {
    function AuthGuardService(router, jwtService, messageService) {
        this.router = router;
        this.jwtService = jwtService;
        this.messageService = messageService;
    }
    AuthGuardService.prototype.canActivate = function () {
        if (this.jwtService.checkToken()) {
            return true;
        }
        else {
            this.messageService.showMessage('登录信息过期', '请重新登录后再访问');
            this.router.navigate(['home']);
            return false;
        }
    };
    AuthGuardService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Injectable"])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* Router */],
            __WEBPACK_IMPORTED_MODULE_2__jwt_service__["a" /* JwtService */],
            __WEBPACK_IMPORTED_MODULE_3__message_dialog_service__["a" /* MessageDialogService */]])
    ], AuthGuardService);
    return AuthGuardService;
}());



/***/ }),

/***/ "./src/app/car-enterance/car-enterance.component.css":
/***/ (function(module, exports) {

module.exports = "  .my-drop-zone {\r\n      border: dotted 3px lightgray;\r\n  }\r\n\r\n  .nv-file-over {\r\n      border: dotted 3px red;\r\n  }\r\n\r\n  /* Default class applied to drop zones on over */\r\n\r\n  .another-file-over-class {\r\n      border: dotted 3px green;\r\n  }\r\n\r\n  html,\r\n  body {\r\n      height: 100%;\r\n  }\r\n\r\n  .mat-grid-tile .mat-grid-tile-header {\r\n      background: #3f51b5;\r\n  }"

/***/ }),

/***/ "./src/app/car-enterance/car-enterance.component.html":
/***/ (function(module, exports) {

module.exports = "<ng-container *ngIf=\"authGuardService.canActivate()\">\n\n  <div class=\"navbar navbar-default\">\n    <div class=\"navbar-header\">\n      <a class=\"navbar-brand\">对准要检测的车牌</a>\n    </div>\n  </div>\n\n  <div>\n    <div>\n      <br/> 单张图片\n      <input type=\"file\" ng2FileSelect [uploader]=\"uploader\" />\n      <mat-card>\n        <mat-card-header>\n          <mat-card-title>上传列表</mat-card-title>\n          <mat-card-subtitle>长度: {{ uploader?.queue?.length }}</mat-card-subtitle>\n        </mat-card-header>\n        <div>\n          进度:\n          <div class=\"progress\" style=\"width:100%;\">\n            <div class=\"progress-bar\" role=\"progressbar\" [ngStyle]=\"{ 'width': uploader.progress + '%' }\"></div>\n          </div>\n        </div>\n        <mat-card-content>\n          <mat-grid-list cols=\"10\" rowHeight=\"50\">\n            <mat-grid-tile [colspan]=\"3\" [rowspan]=\"1\">\n              <mat-grid-tile-header>文件名</mat-grid-tile-header>\n            </mat-grid-tile>\n\n             \n            <mat-grid-tile [colspan]=\"2\" [rowspan]=\"1\">\n              <mat-grid-tile-header>状态</mat-grid-tile-header>\n            </mat-grid-tile>\n            <mat-grid-tile [colspan]=\"5\" [rowspan]=\"1\">\n              <mat-grid-tile-header>选择</mat-grid-tile-header>\n            </mat-grid-tile>\n            <div *ngFor=\"let item of uploader.queue\" style=\"font-size:10pt;\">\n              <mat-grid-tile [colspan]=\"3\" [rowspan]=\"1\">\n                {{ item?.file?.name }}\n              </mat-grid-tile>\n               \n              <mat-grid-tile [colspan]=\"2\" [rowspan]=\"1\">\n                <div class=\"text-center\">\n                  <span *ngIf=\"item.isSuccess\">\n                    <mat-icon class=\"mat-18\">done</mat-icon>\n                  </span>\n                  <span *ngIf=\"item.isCancel\">\n                    <mat-icon class=\"mat-18\">cancel</mat-icon>\n                  </span>\n                  <span *ngIf=\"item.isError\">\n                    <mat-icon class=\"mat-18\">error</mat-icon>\n                  </span>\n                </div>\n              </mat-grid-tile>\n              <mat-grid-tile [colspan]=\"5\" [rowspan]=\"1\">\n                <div style=\"width:100%;text-align:center;\">\n                  <button mat-mini-fab color=\"primary\" style=\"box-shadow:none;\" (click)=\"uploadOne(item)\" [disabled]=\"item.isReady || item.isUploading || item.isSuccess\">\n                    上传\n                  </button>\n                  <button mat-mini-fab color=\"warn\" style=\"box-shadow:none;\" (click)=\"item.cancel()\" [disabled]=\"!item.isUploading\">\n                    取消\n                  </button>\n                  <button mat-mini-fab color=\"warn\"  style=\"box-shadow:none;\" (click)=\"item.remove()\">\n                    移除\n                  </button>\n                </div>\n              </mat-grid-tile>\n            </div>\n          </mat-grid-list>\n        </mat-card-content>\n        <mat-card-footer>\n        </mat-card-footer>\n      </mat-card>\n    </div>\n  </div>\n</ng-container>\n"

/***/ }),

/***/ "./src/app/car-enterance/car-enterance.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CarEnteranceComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ng2_file_upload__ = __webpack_require__("./node_modules/ng2-file-upload/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ng2_file_upload___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_1_ng2_file_upload__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__jwt_service__ = __webpack_require__("./src/app/jwt.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__message_dialog_service__ = __webpack_require__("./src/app/message-dialog.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_ng2_image_compress__ = __webpack_require__("./node_modules/ng2-image-compress/ng2-image-compress.umd.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_ng2_image_compress___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4_ng2_image_compress__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__auth_guard_service__ = __webpack_require__("./src/app/auth-guard.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var URL = '/car/enter';
var CarEnteranceComponent = /** @class */ (function () {
    function CarEnteranceComponent(authGuardService, jwtService, messageService, imgCompressService) {
        this.authGuardService = authGuardService;
        this.jwtService = jwtService;
        this.messageService = messageService;
        this.imgCompressService = imgCompressService;
        this.hasBaseDropZoneOver = false;
        this.hasAnotherDropZoneOver = false;
        this.uploader = new __WEBPACK_IMPORTED_MODULE_1_ng2_file_upload__["FileUploader"]({
            url: URL,
            authToken: localStorage.getItem('token')
        });
    }
    CarEnteranceComponent.prototype.fileOverBase = function (e) {
        this.hasBaseDropZoneOver = e;
    };
    CarEnteranceComponent.prototype.fileOverAnother = function (e) {
        this.hasAnotherDropZoneOver = e;
    };
    CarEnteranceComponent.prototype.uploadOne = function (file) {
        var _this = this;
        file.upload();
        this.uploader.response.subscribe(function (next) {
            var result = JSON.parse(next);
            console.log(result['content']);
            _this.messageService.showMessage(result['msg'], result['content']);
            _this.uploader.response.observers.shift();
        }, function (error) {
            console.log(error);
        }, function () {
            console.log('finfished!!!!!!1');
        });
    };
    CarEnteranceComponent.prototype.alert = function (title, content) {
        this.messageService.showMessage(title, content);
    };
    CarEnteranceComponent.prototype.selectFile = function (file) {
    };
    CarEnteranceComponent.prototype.ngOnInit = function () {
        // refresh token
        this.uploader.setOptions({
            url: URL,
            authToken: localStorage.getItem('token')
        });
    };
    CarEnteranceComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-car-enterance',
            template: __webpack_require__("./src/app/car-enterance/car-enterance.component.html"),
            styles: [__webpack_require__("./src/app/car-enterance/car-enterance.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_5__auth_guard_service__["a" /* AuthGuardService */],
            __WEBPACK_IMPORTED_MODULE_2__jwt_service__["a" /* JwtService */],
            __WEBPACK_IMPORTED_MODULE_3__message_dialog_service__["a" /* MessageDialogService */],
            __WEBPACK_IMPORTED_MODULE_4_ng2_image_compress__["ImageCompressService"]])
    ], CarEnteranceComponent);
    return CarEnteranceComponent;
}());



/***/ }),

/***/ "./src/app/cashier-board/cashier-board.component.css":
/***/ (function(module, exports) {

module.exports = ":host {\r\n    width: 80%;\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-pack: center;\r\n        -ms-flex-pack: center;\r\n            justify-content: center;\r\n}\r\n\r\n.wrapper {\r\n    width: 100%;\r\n}\r\n\r\n.flexCenterContainer {\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-pack: center;\r\n        -ms-flex-pack: center;\r\n            justify-content: center;\r\n}\r\n\r\n.flexCenterContainer * {\r\n    -ms-flex-item-align: center;\r\n        -ms-grid-row-align: center;\r\n        align-self: center;\r\n}\r\n\r\n#searchResult {\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -ms-flex-wrap: wrap;\r\n        flex-wrap: wrap;\r\n    padding: 5px;\r\n    flex-wrap: wrap;\r\n    -webkit-box-pack: start;\r\n        -ms-flex-pack: start;\r\n            justify-content: flex-start;\r\n}\r\n\r\n.orderItem {\r\n    margin: 5px 5px;\r\n    width: 300px;\r\n    height: 100%;\r\n    opacity: 1;\r\n    -webkit-transition: all ease-out 0.2s;\r\n    transition: all ease-out 0.2s;\r\n    -webkit-animation: circleTocube 0.4s ease-out;\r\n            animation: circleTocube 0.4s ease-out;\r\n}\r\n\r\n#basePriceExpansion,\r\n#basePriceExpansion mat-expansion-panel-header {\r\n    padding: 0;\r\n    -webkit-box-shadow: 0 0 0;\r\n            box-shadow: 0 0 0;\r\n    background: none;\r\n}\r\n\r\n@-webkit-keyframes circleTocube {\r\n    from {\r\n        border-radius: 100px;\r\n    }\r\n    to {\r\n        border-radius: 2px;\r\n    }\r\n}\r\n\r\n@keyframes circleTocube {\r\n    from {\r\n        border-radius: 100px;\r\n    }\r\n    to {\r\n        border-radius: 2px;\r\n    }\r\n}"

/***/ }),

/***/ "./src/app/cashier-board/cashier-board.component.html":
/***/ (function(module, exports) {

module.exports = "<div fxLayout=\"column\" fxLayoutAlign=\"start center\" fxLayoutGap=\"gappx\" class=\"wrapper\">\n  <div class=\"orderSearch\">\n    <form class=\"flexCenterContainer\" autocomplete=\"on\">\n      <mat-select #abbrBox name=\"abbrBox\" style=\"width:50px;\" (selectionChange)=\"abbrChange(abbrBox.value)\" value=\"\" placeholder=\"省份\">\n        <mat-option *ngFor=\"let abbr of provinceAbbr\" [value]=\"abbr.value\">{{abbr.viewValue}}</mat-option>\n      </mat-select>\n      <mat-form-field class=\"example-full-width\">\n        <mat-icon matSuffix class=\"example-icon\" color=\"primary\">search</mat-icon>\n        <input #searchBox type=\"text\" (keyup)=\"search(searchBox.value)\" placeholder=\"车牌搜索订单\" matInput>\n        <button *ngIf=\"searchBox.value\" matSuffix mat-icon-button aria-label=\"清除\" (click)=\"searchBox.value=''\">\n          <mat-icon>close</mat-icon>\n        </button>\n      </mat-form-field>\n    </form>\n  </div>\n  <div id=\"searchResult\">\n    <ng-container *ngFor=\"let item of orders$|async\">\n      <mat-card class=\"orderItem\">\n        <mat-card-header>\n          <mat-card-title>\n            <h5>\n              <ng-container *ngIf=\"item.state ==='UNPAY'\">\n                [\n                <font color=\"red\">未付款</font>]\n              </ng-container>\n              <ng-container *ngIf=\"item.state ==='FINISHED'\">\n                [\n                <font color=\"green\">已付款</font>]\n              </ng-container><br>\n              <b>{{item.name}}</b>\n            </h5>\n          </mat-card-title>\n          <mat-card-subtitle>\n            <i style=\"font-size:10px;\">{{item.orderNo}}</i>\n          </mat-card-subtitle>\n        </mat-card-header>\n        <mat-card-content>\n          <mat-accordion>\n            <mat-expansion-panel id=\"basePriceExpansion\">\n              <mat-expansion-panel-header>\n                <mat-panel-title>\n                  <div>总价：\n                    <ng-container *ngIf=\"item.isResetTotal; else showTotal\">\n                      <del><font color=\"black\">{{item.total}}</font></del>\n                      <font size=\"5\" color=\"green\"> {{item.resetTotal}}</font>\n                    </ng-container>\n                    <ng-template #showTotal>\n                      <font color=\"green\">{{item.total}}</font>\n                    </ng-template>\n                  </div>\n                </mat-panel-title>\n                <mat-panel-description>\n                  <ng-container *ngIf=\"item.progress ==='PENDING'\">\n                    <font color=\"LightSeaGreen\">准备中</font>\n                  </ng-container>\n                  <ng-container *ngIf=\"item.progress ==='WORKING'\">\n                    <font color=\"coral\">进行中</font>\n                  </ng-container>\n                  <ng-container *ngIf=\"item.progress ==='WAITING_CONFIRM'\">\n                    <font color=\"crimson\">待客户确认</font>\n                  </ng-container>\n                  <ng-container *ngIf=\"item.progress ==='FINISHED'\">\n                    <font color=\"green\">完成</font>\n                  </ng-container>\n                </mat-panel-description>\n              </mat-expansion-panel-header>\n              <mat-list>\n                <ng-container *ngFor=\"let key of item.optionKeys\">\n                  <mat-list-item>\n                    <font weight=\"blod\">{{key}}:{{item.selectedOption[key]}}</font>\n                  </mat-list-item>\n                  <mat-divider></mat-divider>\n                </ng-container>\n                <button (click)=\"resetTotal(item.total,item.orderNo)\" style=\"margin-top: 10px;max-width:60px;\" align=\"start\" mat-raised-button color=\"warn\">修改金额</button>\n              </mat-list>\n            </mat-expansion-panel>\n          </mat-accordion>\n        </mat-card-content>\n        <mat-card-actions style=\"display:flex;justify-content:space-around;\">\n          <button style=\"max-width:60px;\" align=\"start\" (click)=\"confirmPay(item.orderNo)\" mat-raised-button color=\"primary\">确认结账</button>\n          <button style=\"max-width:60px;\" align=\"end\" (click)=\"cancelOrder(item.orderNo)\" mat-button color=\"primary\">取消订单</button>\n        </mat-card-actions>\n        <mat-card-footer>\n          <ng-container *ngIf=\"item.note!==''\">\n            <div align=\"start\">备注:\n              <font align=\"end\" color=\"blue\" weight=\"bold\">{{item.note}}</font>\n            </div>\n          </ng-container>\n          <ng-container *ngIf=\"item.resetNote!==''\">\n            <br><div align=\"start\">金额修改:\n              <font align=\"end\" color=\"brown\" weight=\"bold\">{{item.resetNote}}</font>\n            </div>\n          </ng-container>\n          \n        </mat-card-footer>\n      </mat-card>\n    </ng-container>\n  </div>\n</div>"

/***/ }),

/***/ "./src/app/cashier-board/cashier-board.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CashierBoardComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_rxjs_Subject__ = __webpack_require__("./node_modules/rxjs/_esm5/Subject.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_observable_of__ = __webpack_require__("./node_modules/rxjs/_esm5/observable/of.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_operators__ = __webpack_require__("./node_modules/rxjs/_esm5/operators.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__entity_order__ = __webpack_require__("./src/app/entity/order.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__auth_module__ = __webpack_require__("./src/auth.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__message_dialog_service__ = __webpack_require__("./src/app/message-dialog.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__message_dialog_message_dialog_component__ = __webpack_require__("./src/app/message-dialog/message-dialog.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};









var CashierBoardComponent = /** @class */ (function () {
    function CashierBoardComponent(messageService, http, requestOption) {
        this.messageService = messageService;
        this.http = http;
        this.provinceAbbr = [
            { value: '', viewValue: '无' },
            { value: '粤', viewValue: '粤' },
            { value: '赣', viewValue: '赣' },
            { value: '湘', viewValue: '湘' },
            { value: '京', viewValue: '京' },
            { value: '冀', viewValue: '冀' },
            { value: '苏', viewValue: '苏' },
            { value: '豫', viewValue: '豫' },
            { value: '辽', viewValue: '辽' },
            { value: '黑', viewValue: '黑' },
            { value: '皖', viewValue: '皖' },
            { value: '新', viewValue: '新' },
            { value: '鄂', viewValue: '鄂' },
            { value: '晋', viewValue: '晋' },
            { value: '陕', viewValue: '陕' },
            { value: '吉', viewValue: '吉' },
            { value: '青', viewValue: '青' },
            { value: '甘', viewValue: '甘' },
            { value: '贵', viewValue: '贵' },
            { value: '浙', viewValue: '浙' },
            { value: '鲁', viewValue: '鲁' },
            { value: '蒙', viewValue: '蒙' },
            { value: '藏', viewValue: '藏' },
            { value: '闽', viewValue: '闽' },
            { value: '川', viewValue: '川' },
            { value: '琼', viewValue: '琼' },
            { value: '云', viewValue: '云' }
        ];
        this.plateAbbr = '';
        this.plateString = '';
        this.searchTerm = new __WEBPACK_IMPORTED_MODULE_1_rxjs_Subject__["a" /* Subject */]();
        this.authHttp = Object(__WEBPACK_IMPORTED_MODULE_5__auth_module__["b" /* authHttpServiceFactory */])(http, requestOption);
    }
    CashierBoardComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.searchTerm.pipe(
        // 等待300毫秒输入搜索关键字
        Object(__WEBPACK_IMPORTED_MODULE_3_rxjs_operators__["a" /* debounceTime */])(300), 
        // 忽略相同的搜索字段
        Object(__WEBPACK_IMPORTED_MODULE_3_rxjs_operators__["b" /* distinctUntilChanged */])(), 
        // switch to new search observable each time the term changes
        Object(__WEBPACK_IMPORTED_MODULE_3_rxjs_operators__["c" /* switchMap */])(function (term) { return _this.searchUnpayOrder(term); })).subscribe(function (l) {
            /**
             * pipe返回的obsevable 事件是懒加载发生的，使用subscrib方法
             * 在事件emit 后 才进行orders的更新
             * 而orders=xxx.pipe()相当于只是绑定了一个事件监听器，不能即刻
             * 用xx.next() emitorders的加载
             */
            _this.orders$ = Object(__WEBPACK_IMPORTED_MODULE_2_rxjs_observable_of__["a" /* of */])(l);
        });
        this.searchTerm.next('all');
        // document.getElementById('').children
    };
    CashierBoardComponent.prototype.abbrChange = function (abbr) {
        this.plateAbbr = abbr;
        this.searchTerm.next(abbr + this.plateString);
    };
    CashierBoardComponent.prototype.search = function (term) {
        this.plateString = term;
        this.searchTerm.next(term);
    };
    CashierBoardComponent.prototype.searchUnpayOrder = function (term) {
        return this.authHttp.post('/order/searchUnpay', {
            plateAbbr: this.plateAbbr,
            plateString: this.plateString
        }).map(function (result) {
            return Object(__WEBPACK_IMPORTED_MODULE_4__entity_order__["a" /* buildOrderOptionKeys */])(result.json()['content']);
        });
    };
    CashierBoardComponent.prototype.confirmPay = function (orderNo) {
        var _this = this;
        var result = this.messageService.showAuthConfirmForm('/order/confirmPay', {
            'orderNo': orderNo
        }, {
            'text': '确定该账单已支付？',
            'confirmText': '已支付'
        });
        console.log(result);
        result.subscribe(function (next) {
            if (next === false) {
                return; // 对话框选择了取消
            }
            next.subscribe(function (next2) {
                if (next2['success']) {
                    _this.searchTerm.next(_this.plateAbbr + _this.plateString + Math.random().toFixed(2));
                    _this.messageService.showMessage('操作成功', next2['msg']);
                }
                else {
                    _this.messageService.showMessage('操作失败', next2['msg']);
                }
            });
        });
    };
    CashierBoardComponent.prototype.cancelOrder = function (orderNo) {
        var _this = this;
        var result = this.messageService.showAuthConfirmForm('/order/cancelOrder', {
            'orderNo': orderNo
        }, {
            'text': '确认取消该订单？',
            'confirmText': '确定'
        });
        // console.log(result);
        result.subscribe(function (next) {
            if (next === false) {
                return; // 对话框选择了取消
            }
            next.subscribe(function (next2) {
                if (next2['success']) {
                    _this.searchTerm.next(_this.plateAbbr + _this.plateString + Math.random().toFixed(2));
                    _this.messageService.showMessage('操作成功', next2['msg']);
                }
                else {
                    _this.messageService.showMessage('操作失败', next2['msg']);
                }
            });
        });
    };
    CashierBoardComponent.prototype.resetTotal = function (original, orderNo) {
        var _this = this;
        var messageData = new __WEBPACK_IMPORTED_MODULE_8__message_dialog_message_dialog_component__["b" /* MyMessageData */]('inputForm');
        messageData.isInputForm = true;
        messageData.messageDetail.text = '修改金额';
        messageData.messageDetail.confirmText = '修改';
        messageData.postData.url = '/order/resetTotal';
        messageData.postData.body = { 'orderNo': orderNo };
        messageData.inputFields = [{
                name: 'resetTotal',
                placeHolder: '金额',
                type: 'number',
                value: original
            }, {
                name: 'note',
                placeHolder: '备注',
                type: 'textarea',
                value: ''
            }];
        this.messageService.showAuthInputForm(messageData).subscribe(function (next) {
            if (next === false) {
                return; // 对话框选择了取消
            }
            next.subscribe(function (next2) {
                if (next2['success']) {
                    _this.searchTerm.next(_this.plateAbbr + _this.plateString + Math.random().toFixed(2));
                    _this.messageService.showMessage('操作成功', next2['msg']);
                }
                else {
                    _this.messageService.showMessage('操作失败', next2['msg']);
                }
            });
        });
    };
    CashierBoardComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-cashier-board',
            template: __webpack_require__("./src/app/cashier-board/cashier-board.component.html"),
            styles: [__webpack_require__("./src/app/cashier-board/cashier-board.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_7__message_dialog_service__["a" /* MessageDialogService */],
            __WEBPACK_IMPORTED_MODULE_6__angular_http__["Http"], __WEBPACK_IMPORTED_MODULE_6__angular_http__["RequestOptions"]])
    ], CashierBoardComponent);
    return CashierBoardComponent;
}());



/***/ }),

/***/ "./src/app/cdk-table-basic-example/cdk-table-basic-example.component.css":
/***/ (function(module, exports) {

module.exports = "/* Structure */\r\n\r\n.example-container {\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-orient: vertical;\r\n    -webkit-box-direction: normal;\r\n        -ms-flex-direction: column;\r\n            flex-direction: column;\r\n    min-width: 300px;\r\n}\r\n\r\n/*\r\n * Styles to make the demo's cdk-table match the material design spec\r\n * https://material.io/guidelines/components/data-tables.html\r\n */\r\n\r\n.example-table {\r\n    -webkit-box-flex: 1;\r\n        -ms-flex: 1 1 auto;\r\n            flex: 1 1 auto;\r\n    overflow: auto;\r\n    max-height: 500px;\r\n}\r\n\r\n.example-header-row,\r\n.example-row {\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    border-bottom: 1px solid #ccc;\r\n    -webkit-box-align: center;\r\n        -ms-flex-align: center;\r\n            align-items: center;\r\n    height: 32px;\r\n    padding: 0 8px;\r\n}\r\n\r\n.example-cell,\r\n.example-header-cell {\r\n    -webkit-box-flex: 1;\r\n        -ms-flex: 1;\r\n            flex: 1;\r\n}\r\n\r\n.example-header-cell {\r\n    font-size: 12px;\r\n    font-weight: bold;\r\n    color: rgba(0, 0, 0, 0.54);\r\n}\r\n\r\n.example-cell {\r\n    font-size: 13px;\r\n    color: rgba(0, 0, 0, 0.87);\r\n}"

/***/ }),

/***/ "./src/app/cdk-table-basic-example/cdk-table-basic-example.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"example-container mat-elevation-z8\">\n  <cdk-table #table [dataSource]=\"dataSource\" class=\"example-table\">\n    <!--- Note that these columns can be defined in any order.\n          The actual rendered columns are set as a property on the row definition\" -->\n\n    <!-- ID Column -->\n    <ng-container cdkColumnDef=\"userId\">\n      <cdk-header-cell *cdkHeaderCellDef class=\"example-header-cell\"> ID </cdk-header-cell>\n      <cdk-cell *cdkCellDef=\"let row\" class=\"example-cell\"> {{row.id}} </cdk-cell>\n    </ng-container>\n\n    <!-- Progress Column -->\n    <ng-container cdkColumnDef=\"progress\">\n      <cdk-header-cell *cdkHeaderCellDef class=\"example-header-cell\"> Progress </cdk-header-cell>\n      <cdk-cell *cdkCellDef=\"let row\" class=\"example-cell\"> {{row.progress}}% </cdk-cell>\n    </ng-container>\n\n    <!-- Name Column -->\n    <ng-container cdkColumnDef=\"userName\">\n      <cdk-header-cell *cdkHeaderCellDef class=\"example-header-cell\"> Name </cdk-header-cell>\n      <cdk-cell *cdkCellDef=\"let row\" class=\"example-cell\"> {{row.name}} </cdk-cell>\n    </ng-container>\n\n    <!-- Color Column -->\n    <ng-container cdkColumnDef=\"color\">\n      <cdk-header-cell *cdkHeaderCellDef class=\"example-header-cell\">Color</cdk-header-cell>\n      <cdk-cell *cdkCellDef=\"let row\" class=\"example-cell\" [style.color]=\"row.color\">\n        {{row.color}}\n      </cdk-cell>\n    </ng-container>\n\n    <cdk-header-row *cdkHeaderRowDef=\"displayedColumns\" class=\"example-header-row\"></cdk-header-row>\n    <cdk-row *cdkRowDef=\"let row; columns: displayedColumns;\" class=\"example-row\"></cdk-row>\n  </cdk-table>\n</div>"

/***/ }),

/***/ "./src/app/cdk-table-basic-example/cdk-table-basic-example.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CdkTableBasicExampleComponent; });
/* unused harmony export ExampleDatabase */
/* unused harmony export ExampleDataSource */
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_cdk_collections__ = __webpack_require__("./node_modules/@angular/cdk/esm5/collections.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_BehaviorSubject__ = __webpack_require__("./node_modules/rxjs/_esm5/BehaviorSubject.js");
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var CdkTableBasicExampleComponent = /** @class */ (function () {
    function CdkTableBasicExampleComponent() {
        this.displayedColumns = ['userId', 'userName', 'progress', 'color'];
        this.exampleDatabase = new ExampleDatabase();
    }
    CdkTableBasicExampleComponent.prototype.ngOnInit = function () {
        this.dataSource = new ExampleDataSource(this.exampleDatabase);
    };
    CdkTableBasicExampleComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-cdk-table-basic-example',
            template: __webpack_require__("./src/app/cdk-table-basic-example/cdk-table-basic-example.component.html"),
            styles: [__webpack_require__("./src/app/cdk-table-basic-example/cdk-table-basic-example.component.css")]
        })
    ], CdkTableBasicExampleComponent);
    return CdkTableBasicExampleComponent;
}());

/** Constants used to fill up our data base. */
var COLORS = ['maroon', 'red', 'orange', 'yellow', 'olive', 'green', 'purple',
    'fuchsia', 'lime', 'teal', 'aqua', 'blue', 'navy', 'black', 'gray'];
var NAMES = ['Maia', 'Asher', 'Olivia', 'Atticus', 'Amelia', 'Jack',
    'Charlotte', 'Theodore', 'Isla', 'Oliver', 'Isabella', 'Jasper',
    'Cora', 'Levi', 'Violet', 'Arthur', 'Mia', 'Thomas', 'Elizabeth'];
/** An example database that the data source uses to retrieve data for the table. */
var ExampleDatabase = /** @class */ (function () {
    function ExampleDatabase() {
        /** Stream that emits whenever the data has been modified. */
        this.dataChange = new __WEBPACK_IMPORTED_MODULE_2_rxjs_BehaviorSubject__["a" /* BehaviorSubject */]([]);
        // Fill up the database with 100 users.
        for (var i = 0; i < 100; i++) {
            this.addUser();
        }
    }
    Object.defineProperty(ExampleDatabase.prototype, "data", {
        get: function () { return this.dataChange.value; },
        enumerable: true,
        configurable: true
    });
    /** Adds a new user to the database. */
    ExampleDatabase.prototype.addUser = function () {
        var copiedData = this.data.slice();
        copiedData.push(this.createNewUser());
        this.dataChange.next(copiedData);
    };
    /** Builds and returns a new User. */
    ExampleDatabase.prototype.createNewUser = function () {
        var name = NAMES[Math.round(Math.random() * (NAMES.length - 1))] + ' ' +
            NAMES[Math.round(Math.random() * (NAMES.length - 1))].charAt(0) + '.';
        return {
            id: (this.data.length + 1).toString(),
            name: name,
            progress: Math.round(Math.random() * 100).toString(),
            color: COLORS[Math.round(Math.random() * (COLORS.length - 1))]
        };
    };
    return ExampleDatabase;
}());

/**
 * Data source to provide what data should be rendered in the table. Note that the data source
 * can retrieve its data in any way. In this case, the data source is provided a reference
 * to a common data base, ExampleDatabase. It is not the data source's responsibility to manage
 * the underlying data. Instead, it only needs to take the data and send the table exactly what
 * should be rendered.
 */
var ExampleDataSource = /** @class */ (function (_super) {
    __extends(ExampleDataSource, _super);
    function ExampleDataSource(_exampleDatabase) {
        var _this = _super.call(this) || this;
        _this._exampleDatabase = _exampleDatabase;
        return _this;
    }
    /** Connect function called by the table to retrieve one stream containing the data to render. */
    ExampleDataSource.prototype.connect = function () {
        return this._exampleDatabase.dataChange;
    };
    ExampleDataSource.prototype.disconnect = function () { };
    return ExampleDataSource;
}(__WEBPACK_IMPORTED_MODULE_1__angular_cdk_collections__["a" /* DataSource */]));



/***/ }),

/***/ "./src/app/entity/order.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export Order */
/* harmony export (immutable) */ __webpack_exports__["b"] = getOrdersFromPage;
/* harmony export (immutable) */ __webpack_exports__["a"] = buildOrderOptionKeys;
var Order = /** @class */ (function () {
    function Order() {
    }
    return Order;
}());

function getOrdersFromPage(page) {
    var orders = page.content;
    orders.forEach(function (element) {
        element.optionKeys = Object.keys(element.selectedOption);
    });
    return orders;
}
function buildOrderOptionKeys(orders) {
    orders.forEach(function (element) {
        element.optionKeys = Object.keys(element.selectedOption);
    });
    return orders;
}


/***/ }),

/***/ "./src/app/entity/page.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export Sort */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Page; });
/* harmony export (immutable) */ __webpack_exports__["b"] = jsonToPage;
var Sort = /** @class */ (function () {
    function Sort() {
    }
    return Sort;
}());

var Page = /** @class */ (function () {
    function Page() {
    }
    return Page;
}());

function jsonToPage(json) {
    var page = new Page();
    page.first = json['first'];
    page.last = json['last'];
    page.number = json['number'];
    page.size = json['size'];
    page.sort = json['sort'];
    page.totalElements = json['totalElements'];
    page.totalPages = json['totalPages'];
    page.content = json['content'];
    return page;
}


/***/ }),

/***/ "./src/app/entity/product.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export Product */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return PRODUCTS; });
var Product = /** @class */ (function () {
    function Product(name) {
        this.id = null;
        this.name = name;
    }
    return Product;
}());

var PRODUCTS = [
    {
        id: 1,
        type: null,
        name: '小型车洗车服务',
        description: '为车型在xxxx一下的车提供洗车服务',
        costTime: null,
        startPrice: 35,
        originalPrice: null,
        thumbnailImg: null,
        imges: null,
        isSelling: false,
        saleCount: 0
    },
    {
        id: 2,
        type: null,
        name: '2型车洗车服务',
        description: '为车型在xxxx一下的车提供洗车服务',
        costTime: null,
        startPrice: 35,
        originalPrice: null,
        thumbnailImg: null,
        imges: null,
        isSelling: false,
        saleCount: 0
    }, {
        id: 3,
        type: null,
        name: '3型车洗车服务',
        description: '为车型在xxxx一下的车提供洗车服务',
        costTime: null,
        startPrice: 35,
        originalPrice: null,
        thumbnailImg: null,
        imges: null,
        isSelling: false,
        saleCount: 0
    }, {
        id: 3,
        type: null,
        name: '4型车洗车服务',
        description: '为车型在xxxx一下的车提供洗车服务',
        costTime: null,
        startPrice: 35,
        originalPrice: null,
        thumbnailImg: null,
        imges: null,
        isSelling: false,
        saleCount: 0
    }, {
        id: 3,
        type: null,
        name: '5型车洗车服务',
        description: '为车型在xxxx一下的车提供洗车服务',
        costTime: null,
        startPrice: 35,
        originalPrice: null,
        thumbnailImg: null,
        imges: null,
        isSelling: false,
        saleCount: 0
    }, {
        id: 3,
        type: null,
        name: '小型车洗车服务',
        description: '为车型在xxxx一下的车提供洗车服务',
        costTime: null,
        startPrice: 35,
        originalPrice: null,
        thumbnailImg: null,
        imges: null,
        isSelling: false,
        saleCount: 0
    }, {
        id: 3,
        type: null,
        name: '小型车洗车服务',
        description: '为车型在xxxx一下的车提供洗车服务',
        costTime: null,
        startPrice: 35,
        originalPrice: null,
        thumbnailImg: null,
        imges: null,
        isSelling: false,
        saleCount: 0
    }, {
        id: 3,
        type: null,
        name: '小型车洗车服务',
        description: '为车型在xxxx一下的车提供洗车服务',
        costTime: null,
        startPrice: 35,
        originalPrice: null,
        thumbnailImg: null,
        imges: null,
        isSelling: false,
        saleCount: 0
    }
];


/***/ }),

/***/ "./src/app/entity/service-option.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export OptionDetail */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ServiceOption; });
/* harmony export (immutable) */ __webpack_exports__["b"] = mapServiceOption;
/* unused harmony export buildOptionDetailList */
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0_rxjs_observable_of__ = __webpack_require__("./node_modules/rxjs/_esm5/observable/of.js");

var OptionDetail = /** @class */ (function () {
    function OptionDetail(itemName, price) {
        this.itemName = itemName;
        this.price = price;
    }
    return OptionDetail;
}());

var ServiceOption = /** @class */ (function () {
    function ServiceOption() {
        this.price = 0.0;
    }
    return ServiceOption;
}());

function mapServiceOption(serviceOptions) {
    var options = new Array;
    var optionsName = new Set(serviceOptions.map(function (child) { return child.optionType; }));
    optionsName.forEach(function (oName) {
        var items = new Array();
        var o = new ServiceOption();
        for (var i = 0; i < serviceOptions.length; i++) {
            if (serviceOptions[i].optionType !== oName) {
                continue;
            }
            if (o.name === undefined) {
                o.name = serviceOptions[i].name;
            }
            var item = new OptionDetail(serviceOptions[i].itemName, serviceOptions[i].price);
            items.push(item);
        }
        o.optionType = oName;
        o.options = items;
        options.push(o);
    });
    return Object(__WEBPACK_IMPORTED_MODULE_0_rxjs_observable_of__["a" /* of */])(options);
}
function buildOptionDetailList(serviceOptions) {
    var options = new Array();
    for (var i = 0; i < serviceOptions.length; i++) {
        var item = new OptionDetail(serviceOptions[i].itemName, serviceOptions[i].price);
        options.push(item);
    }
    return Object(__WEBPACK_IMPORTED_MODULE_0_rxjs_observable_of__["a" /* of */])(options);
}


/***/ }),

/***/ "./src/app/entity/user.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return User; });
/* unused harmony export USER */
/* unused harmony export RSA_PRIVATE_KEY */
var User = /** @class */ (function () {
    function User() {
        this.id = null;
        this.username = null;
        this.password = null;
        this.authorities = null;
    }
    return User;
}());

var USER = {
    id: null,
    username: null,
    password: null,
    authorities: null
};
var RSA_PRIVATE_KEY = 'ss';


/***/ }),

/***/ "./src/app/index-page/index-page.component.css":
/***/ (function(module, exports) {

module.exports = ":host {\r\n    /* 对父标签样式操作 即component的directive */\r\n    width: 80%;\r\n}\r\n\r\n.example-full-width {\r\n    width: 80%;\r\n}\r\n\r\n.flexCenterContainer {\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-pack: center;\r\n        -ms-flex-pack: center;\r\n            justify-content: center;\r\n}\r\n\r\n.flexCenterContainer * {\r\n    -ms-flex-item-align: center;\r\n        -ms-grid-row-align: center;\r\n        align-self: center;\r\n}\r\n\r\n.serviceWrap {\r\n    padding: 0 5px;\r\n    margin-top: 10px;\r\n}\r\n\r\n.serviceShow {\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-pack: justify;\r\n        -ms-flex-pack: justify;\r\n            justify-content: space-between;\r\n    /* 两端*/\r\n    -ms-flex-wrap: wrap;\r\n        flex-wrap: wrap;\r\n}\r\n\r\n.starButton {\r\n    outline: none;\r\n    color: #e6e600;\r\n}\r\n\r\n.starButton:focus {\r\n    outline: none;\r\n}\r\n\r\n.service-card {\r\n    margin: 10px;\r\n    -webkit-animation: showUp 0.1s linear;\r\n            animation: showUp 0.1s linear;\r\n}\r\n\r\n.searchResult {\r\n    position: absolute;\r\n    z-index: 2;\r\n    width: 80%;\r\n    top: -10px;\r\n    -webkit-box-shadow: 0 1px 3px 0 grey;\r\n            box-shadow: 0 1px 3px 0 grey;\r\n}\r\n\r\n.carousel {\r\n    -webkit-animation: showUp 0.3s linear;\r\n            animation: showUp 0.3s linear;\r\n}\r\n\r\n@-webkit-keyframes showUp {\r\n    from {\r\n        opacity: 0;\r\n    }\r\n    to {\r\n        opacity: 1;\r\n    }\r\n}\r\n\r\n@keyframes showUp {\r\n    from {\r\n        opacity: 0;\r\n    }\r\n    to {\r\n        opacity: 1;\r\n    }\r\n}"

/***/ }),

/***/ "./src/app/index-page/index-page.component.html":
/***/ (function(module, exports) {

module.exports = "<mat-progress-bar style=\"position: absolute;top: 0;left:0;\" mode=\"indeterminate\" *ngIf=\"!resultState\"></mat-progress-bar>\n<div class=\"serviceWrap\">\n  <div class=\"serviceSearch\">\n    <form class=\"flexCenterContainer\" autocomplete=\"on\">\n      <mat-icon matSuffix class=\"example-icon\" color=\"primary\">search</mat-icon>\n      <mat-form-field class=\"example-full-width\">\n        <input #searchBox type=\"text\" (blur)=\"searchBlur(searchBox.value)\" (click)=\"searchMode=true\" (keyup)=\"search(searchBox.value)\"\n          placeholder=\"店内产品搜索\" matInput>\n      </mat-form-field>\n      <a mat-icon-button *ngIf=\"searchMode\" (click)=\"searchMode=false\" color=\"primary\">\n        <mat-icon class=\"mat-18\">close</mat-icon>\n      </a>\n      <!-- 搜索框 -->\n      <!-- \n      <div style=\"position:relative\">\n        <div id=\"searchResult\" class=\"searchResult\">\n          <mat-option *ngFor=\"let option of product$ | async\" [value]=\"option\">\n            {{ option.name }}\n          </mat-option>\n        </div>\n      </div>  -->\n    </form>\n  </div>\n  <ng-container *ngIf=\"!searchMode; else showSearch\">\n    <ngb-carousel class=\"carousel\" >\n      <ng-template *ngFor=\"let item of images\" ngbSlide>\n        <img style=\"width: 100%;\" [src]=\"item.imgUrl\" alt=\"{{item.title}}\">\n        <div class=\"carousel-caption\">\n          <h3>{{item.title}}</h3>\n          <p>{{item.description}}</p>  \n        </div>\n      </ng-template>\n    </ngb-carousel>\n  </ng-container>\n  <ng-template #showSearch>\n    <div class=\"searchResultFeild\">\n      <div style=\"flex: 1 1 auto;\"></div>\n      <div class=\"serviceShow\">\n        <!-- <mat-progress-bar mode=\"indeterminate\" *ngIf=\"!resultState\"></mat-progress-bar> -->\n        <ng-container *ngFor=\"let item of product$ | async;index as i\">\n          <mat-card class=\"service-card\">\n            <mat-card-header>\n              <div mat-card-avatar class=\"example-header-image\"></div>\n              <mat-card-title>{{item.name}} </mat-card-title>\n              <mat-card-subtitle>{{item.type}}</mat-card-subtitle>\n            </mat-card-header>\n            <mat-card-content>\n              <p>\n                {{item.description}}\n              </p>\n            </mat-card-content>\n            <mat-card-actions>\n              <button mat-raised-button color=\"primary\">购买</button>\n              <button mat-icon-button class=\"starButton\">\n                <mat-icon class=\"starButton\">star</mat-icon>\n              </button>\n            </mat-card-actions>\n          </mat-card>\n        </ng-container>\n      </div>\n      <div style=\"flex: 1 1 auto;\"></div>\n    </div>\n\n  </ng-template>\n</div>"

/***/ }),

/***/ "./src/app/index-page/index-page.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return IndexPageComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_rxjs_Subject__ = __webpack_require__("./node_modules/rxjs/_esm5/Subject.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_observable_of__ = __webpack_require__("./node_modules/rxjs/_esm5/observable/of.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_operators__ = __webpack_require__("./node_modules/rxjs/_esm5/operators.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__product_retrieve_service__ = __webpack_require__("./src/app/product-retrieve.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__entity_product__ = __webpack_require__("./src/app/entity/product.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__angular_common_http__ = __webpack_require__("./node_modules/@angular/common/esm5/http.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};







var IndexPageComponent = /** @class */ (function () {
    function IndexPageComponent(_http, productRetrieveService) {
        this._http = _http;
        this.productRetrieveService = productRetrieveService;
        this.searchTerms = new __WEBPACK_IMPORTED_MODULE_1_rxjs_Subject__["a" /* Subject */]();
        this.resultState = true;
        this.searchMode = false;
    }
    IndexPageComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.products = __WEBPACK_IMPORTED_MODULE_5__entity_product__["a" /* PRODUCTS */];
        // this.getProducts();
        this.product$ = this.searchTerms.pipe(
        // 等待300毫秒输入搜索关键字
        Object(__WEBPACK_IMPORTED_MODULE_3_rxjs_operators__["a" /* debounceTime */])(300), 
        // 忽略相同的搜索字段
        Object(__WEBPACK_IMPORTED_MODULE_3_rxjs_operators__["b" /* distinctUntilChanged */])(), 
        // switch to new search observable each time the term changes
        Object(__WEBPACK_IMPORTED_MODULE_3_rxjs_operators__["c" /* switchMap */])(function (term) { return _this.searchFromHome(term); }));
        this._http.get('/home/carousel')
            .pipe()
            .subscribe(function (images) { _this.images = images; });
    };
    IndexPageComponent.prototype.searchFromHome = function (term) {
        var _this = this;
        var s = this.productRetrieveService.findProductFromHome(term);
        s.subscribe(function (next) {
            _this.resultState = true;
        });
        return s;
    };
    IndexPageComponent.prototype.searchFromProducts = function (term) {
        var result = new Array();
        this.products.forEach(function (product) {
            if (product.name === term) {
                result.push(product);
            }
        });
        this.resultState = true;
        return Object(__WEBPACK_IMPORTED_MODULE_2_rxjs_observable_of__["a" /* of */])(result);
    };
    IndexPageComponent.prototype.search = function (term) {
        this.resultState = false;
        this.searchTerms.next(term);
    };
    IndexPageComponent.prototype.searchBlur = function (searchBoxValue) {
        if (searchBoxValue === '') {
            this.searchMode = false;
        }
    };
    IndexPageComponent.prototype.getProducts = function () {
        var _this = this;
        this.productRetrieveService.getAllProduct().subscribe(function (products) {
            _this.products = products;
        });
    };
    IndexPageComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-index-page',
            template: __webpack_require__("./src/app/index-page/index-page.component.html"),
            styles: [__webpack_require__("./src/app/index-page/index-page.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_6__angular_common_http__["a" /* HttpClient */],
            __WEBPACK_IMPORTED_MODULE_4__product_retrieve_service__["a" /* ProductRetrieveService */]])
    ], IndexPageComponent);
    return IndexPageComponent;
}());



/***/ }),

/***/ "./src/app/jwt.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return JwtService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("./node_modules/@angular/common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_angular2_jwt__ = __webpack_require__("./node_modules/angular2-jwt/angular2-jwt.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_angular2_jwt___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_angular2_jwt__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__auth_module__ = __webpack_require__("./src/auth.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__entity_user__ = __webpack_require__("./src/app/entity/user.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var JwtService = /** @class */ (function () {
    function JwtService(http, httpClient, generalHttp) {
        this.http = http;
        this.httpClient = httpClient;
        this.generalHttp = generalHttp;
        this.user = new __WEBPACK_IMPORTED_MODULE_5__entity_user__["a" /* User */]();
        this.authConfig = new __WEBPACK_IMPORTED_MODULE_3_angular2_jwt__["AuthConfig"]({
            tokenName: 'token',
            tokenGetter: (function () { return localStorage.getItem('token'); }),
            globalHeaders: [{ 'Content-Type': 'application/json' }],
        });
        this.jwtHelper = new __WEBPACK_IMPORTED_MODULE_3_angular2_jwt__["JwtHelper"]();
        // this.requestOptions.headers.append('Content-Type', 'application/json');
        this.authHttp = Object(__WEBPACK_IMPORTED_MODULE_4__auth_module__["c" /* customAuthHttpServiceFactory */])(this.authConfig, this.generalHttp, this.requestOptions);
        this.updateUser(localStorage.getItem('token'));
    }
    JwtService.prototype.getCurrentUser = function () {
        return this.user;
    };
    JwtService.prototype.updateUser = function (token) {
        if (token === undefined || token === null || token === 'undefined') {
            return;
        }
        var raw = this.jwtHelper.decodeToken(token);
        this.user.username = raw['sub'];
        this.user.authorities = raw['authorities'];
        console.log(raw['authorities']);
        console.log(this.user);
    };
    JwtService.prototype.logout = function () {
        localStorage.removeItem('token');
        this.user = new __WEBPACK_IMPORTED_MODULE_5__entity_user__["a" /* User */]();
        console.log(localStorage.getItem('token'));
        this.httpClient.post('/logout', {});
    };
    /**
     * true if not expired
     */
    JwtService.prototype.checkToken = function () {
        var token = this.authConfig.getConfig().tokenGetter();
        if (token === 'undefined' || token === undefined || token === null) {
            return false;
        }
        else {
            return Object(__WEBPACK_IMPORTED_MODULE_3_angular2_jwt__["tokenNotExpired"])('', token.toString());
        }
    };
    /**
    * 当前用户拥有权限则返回true
    * 否则 false
    * @param required 符合的权限
    */
    JwtService.prototype.hasAuthority = function (required) {
        if (this.user.authorities === null) {
            return false;
        }
        if (this.user.authorities.includes(required)) {
            return true;
        }
        return false;
    };
    /**
     * 当前用户拥有任一权限集合中的权限则，返回true
     * 否则 false
     * @param authorities 符合的权限集合
     */
    JwtService.prototype.hasOneOfAuthorities = function (authorities) {
        var _this = this;
        var result = false;
        if (this.user.authorities === null) {
            return false;
        }
        authorities.forEach(function (required) {
            if (_this.user.authorities.includes(required)) {
                result = true;
            }
        });
        return result;
    };
    /**
       * 当前用户拥有权限集合中的所有权限，则返回true
       * 否则 false
       * @param authorities 符合的权限集合
       */
    JwtService.prototype.hasBothAuthorities = function (authorities) {
        var _this = this;
        var result = true;
        if (this.user.authorities === null) {
            return false;
        }
        authorities.forEach(function (required) {
            if (!_this.user.authorities.includes(required)) {
                result = false;
            }
        });
        return result;
    };
    JwtService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Injectable"])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__angular_http__["Http"], __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["a" /* HttpClient */], __WEBPACK_IMPORTED_MODULE_2__angular_http__["Http"]])
    ], JwtService);
    return JwtService;
}());



/***/ }),

/***/ "./src/app/login-dialog/login-dialog.component.css":
/***/ (function(module, exports) {

module.exports = ".loginInput{\r\n    width: 100%;\r\n    -ms-flex-wrap: wrap;\r\n        flex-wrap: wrap;\r\n}"

/***/ }),

/***/ "./src/app/login-dialog/login-dialog.component.html":
/***/ (function(module, exports) {

module.exports = "<ng-container >\n<div style=\"font-size:20pt;\">\n  <div fxLayout=\"row\" fxLayoutAlign=\"start start\" fxLayoutGap=\"gappx\">\n    <div fxFlex=\"100%\" fxLayoutAlign=\"center center\" fxFlexFill>\n      <span>用户登录</span>\n    </div>\n  </div>\n  <br>\n  <br>\n  <div fxLayout=\"row\" fxLayoutAlign=\"center center\">\n    <div (keyup.enter)=\"loginSubmit()\" fxFelx=\"100%\" class=\"loginForm\">\n\n      <mat-form-field class=\"loginInput\">\n\n        <input matInput placeholder=\"用户名/手机号码\" [(ngModel)]=\"user.username\">\n        <mat-icon matSuffix class=\"example-icon\" color=\"primary\">account_box</mat-icon>\n      </mat-form-field>\n      <mat-form-field class=\"loginInput\">\n        <input type=\"password\" matInput placeholder=\"密码\" [(ngModel)]=\"user.password\">\n        <mat-icon matSuffix color=\"primary\">vpn_key</mat-icon>\n      </mat-form-field>\n\n      <button mat-button (click)=\"loginSubmit()\" color=\"primary\">\n        <mat-icon class=\"mat-18\">fingerprint</mat-icon>\n        <span>登录</span>\n      </button>\n\n      <button mat-button (click)=\"loginCancel()\" color=\"primary\">\n        <mat-icon class=\"mat-18\">close</mat-icon>\n        <span>取消</span>\n      </button>\n    </div>\n\n  </div>\n</div>\n</ng-container>\n"

/***/ }),

/***/ "./src/app/login-dialog/login-dialog.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LoginDialogComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__("./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__entity_user__ = __webpack_require__("./src/app/entity/user.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__jwt_service__ = __webpack_require__("./src/app/jwt.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_common_http__ = __webpack_require__("./node_modules/@angular/common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__message_dialog_service__ = __webpack_require__("./src/app/message-dialog.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var LoginDialogComponent = /** @class */ (function () {
    function LoginDialogComponent(httpClient, dialogRef, messageService, jwtService) {
        this.httpClient = httpClient;
        this.dialogRef = dialogRef;
        this.messageService = messageService;
        this.jwtService = jwtService;
        this.user = new __WEBPACK_IMPORTED_MODULE_2__entity_user__["a" /* User */]();
        this.isAuthenticated = false;
    }
    LoginDialogComponent.prototype.loginCancel = function () {
        this.dialogRef.close();
        this.user = new __WEBPACK_IMPORTED_MODULE_2__entity_user__["a" /* User */]();
    };
    LoginDialogComponent.prototype.loginSubmit = function () {
        var _this = this;
        var username = this.user.username;
        var password = this.user.password;
        this.httpClient.post('/login', { username: username, password: password })
            .subscribe(function (next) {
            localStorage.setItem('token', next['token']);
            _this.jwtService.updateUser(next['token']);
            _this.dialogRef.close();
            _this.messageService.showMessage('消息', '登录成功');
        }, function (error) {
            _this.messageService.showMessage('消息', '登录失败: ' + error);
        }, function () {
        });
        // this.jwtService.login(this.user.username, this.user.password);
        // if (this.jwtService.checkToken()) {
        //   this.isAuthenticated = true;
        //   this.user = new User();
        // } else {
        //   alert('登录失败：');
        // }
        // const result = this.jwtService.login(this.user.username, this.user.password);
        // if (result['success'] === true) {
        //   this.isAuthenticated = true;
        //   this.user = USER;
        // } else {
        //   alert('登录失败：' + result['message']);
        // }
    };
    LoginDialogComponent.prototype.ngOnInit = function () {
    };
    LoginDialogComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-login-dialog',
            template: __webpack_require__("./src/app/login-dialog/login-dialog.component.html"),
            styles: [__webpack_require__("./src/app/login-dialog/login-dialog.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_4__angular_common_http__["a" /* HttpClient */],
            __WEBPACK_IMPORTED_MODULE_1__angular_material__["k" /* MatDialogRef */],
            __WEBPACK_IMPORTED_MODULE_5__message_dialog_service__["a" /* MessageDialogService */],
            __WEBPACK_IMPORTED_MODULE_3__jwt_service__["a" /* JwtService */]])
    ], LoginDialogComponent);
    return LoginDialogComponent;
}());



/***/ }),

/***/ "./src/app/message-dialog.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MessageDialogService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__("./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__message_dialog_message_dialog_component__ = __webpack_require__("./src/app/message-dialog/message-dialog.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var MessageDialogService = /** @class */ (function () {
    function MessageDialogService(dialog) {
        this.dialog = dialog;
    }
    MessageDialogService.prototype.showMessage = function (title, content) {
        var dialogRef = this.dialog.open(__WEBPACK_IMPORTED_MODULE_2__message_dialog_message_dialog_component__["a" /* MessageDialogComponent */], {
            data: {
                'messageOnly': true,
                'title': title,
                'content': content
            },
            closeOnNavigation: true
        });
        dialogRef.afterClosed().subscribe(function (result) {
        });
    };
    MessageDialogService.prototype.showAuthConfirmForm = function (url, body, messageDetail) {
        var dialogRef = this.dialog.open(__WEBPACK_IMPORTED_MODULE_2__message_dialog_message_dialog_component__["a" /* MessageDialogComponent */], {
            data: {
                'isConfirmForm': true,
                'postData': {
                    'url': url,
                    'body': body
                },
                'messageDetail': messageDetail
            },
            closeOnNavigation: true
        });
        return dialogRef.afterClosed();
    };
    MessageDialogService.prototype.showAuthInputForm = function (messageData) {
        var dialogRef = this.dialog.open(__WEBPACK_IMPORTED_MODULE_2__message_dialog_message_dialog_component__["a" /* MessageDialogComponent */], {
            data: messageData,
            closeOnNavigation: true
        });
        return dialogRef.afterClosed();
    };
    MessageDialogService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Injectable"])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_material__["i" /* MatDialog */]])
    ], MessageDialogService);
    return MessageDialogService;
}());



/***/ }),

/***/ "./src/app/message-dialog/message-dialog.component.css":
/***/ (function(module, exports) {

module.exports = ".dialog-content{\r\n    text-align: center;\r\n    min-width: 200px;\r\n    min-height: 100px;\r\n}"

/***/ }),

/***/ "./src/app/message-dialog/message-dialog.component.html":
/***/ (function(module, exports) {

module.exports = "<ng-container *ngIf=\"data.messageOnly\">\n  <h3 style=\"text-align:center;\" mat-dialog-title>{{data.title}}</h3>\n  <mat-dialog-content>\n    <div class=\"dilog-content\">{{data.content}}</div>\n  </mat-dialog-content>\n  <mat-dialog-actions fxFlexAlign='center center'>\n    <!-- <button mat-button mat-dialog-close>Cancel</button> -->\n    <button mat-button [mat-dialog-close]=\"true\" cdkFocusInitial>确认</button>\n  </mat-dialog-actions>\n</ng-container>\n\n\n<ng-container *ngIf=\"data.isConfirmForm\">\n  <div fxLayout=\"column\" fxLayoutAlign=\"start start\" fxLayoutGap=\"5px\">\n    <div class=\"messagePos\">\n      <mat-dialog-content>\n        <ng-container *ngIf=\"data.messageDetail.text!==undefined; else elseTemplate\">\n          {{data.messageDetail.text}}\n        </ng-container>\n        <ng-template #elseTemplate>\n          是否执行该操作？\n        </ng-template>\n      </mat-dialog-content>\n    </div>\n    <mat-dialog-actions class=\"actionPos\" fxLayout=\"row\" fxLayoutAlign=\"space-around center\" fxLayoutGap=\"5px\">\n      <button [mat-dialog-close]=\"submit()\" cdkFocusInitial mat-raised-button>\n        <ng-container *ngIf=\"data.messageDetail.confirmText!==undefined; else elseTemplate\">\n          {{data.messageDetail.confirmText}}\n        </ng-container>\n        <ng-template #elseTemplate>\n          确定\n        </ng-template>\n      </button>\n      <button mat-button [mat-dialog-close]=\"false\">取消</button>\n    </mat-dialog-actions>\n  </div>\n</ng-container>\n\n<ng-container *ngIf=\"data.isInputForm\">\n  <h3 style=\"text-align:center;\" mat-dialog-title>{{data.messageDetail.text}}</h3>\n  <div fxLayout=\"column\" fxLayoutAlign=\"start start\" fxLayoutGap=\"5px\">\n    <ng-container *ngFor=\"let item of data.inputFields; index as i\">\n      <mat-form-field>\n        <input matInput [type]=\"item.type\" (keyup)=\"makeBody(i)\" [value]=\"item.value\"  [name]=\"item.name\"  [placeholder]=\"item.placeHolder\" />\n      </mat-form-field>\n    </ng-container>\n  </div>\n  <mat-dialog-actions class=\"actionPos\" fxLayout=\"row\" fxLayoutAlign=\"space-around center\" fxLayoutGap=\"5px\">\n    <button color=\"warn\" [mat-dialog-close]=\"submitInputForm()\" cdkFocusInitial mat-raised-button>\n      <ng-container *ngIf=\"data.messageDetail.confirmText!==undefined; else elseTemplate\">\n        {{data.messageDetail.confirmText}}\n      </ng-container>\n      <ng-template #elseTemplate>\n        确定\n      </ng-template>\n    </button>\n    <button mat-button [mat-dialog-close]=\"false\">取消</button>\n  </mat-dialog-actions>\n</ng-container>"

/***/ }),

/***/ "./src/app/message-dialog/message-dialog.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MessageDialogComponent; });
/* unused harmony export MyMessageDetail */
/* unused harmony export MyPostData */
/* unused harmony export MyInputField */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "b", function() { return MyMessageData; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__("./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__auth_module__ = __webpack_require__("./src/auth.module.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};




var MessageDialogComponent = /** @class */ (function () {
    function MessageDialogComponent(data, http, requestOptions) {
        this.data = data;
        this.messageData = data;
        if (this.data.messageOnly !== true) {
            this.authHttp = Object(__WEBPACK_IMPORTED_MODULE_3__auth_module__["b" /* authHttpServiceFactory */])(http, requestOptions);
        }
    }
    MessageDialogComponent.prototype.submit = function () {
        this.confirmResult = this.authHttp.post(this.data.postData.url, this.data.postData.body).map(function (rsp) { return rsp.json(); });
        return this.confirmResult;
    };
    MessageDialogComponent.prototype.makeBody = function (i) {
        var fields = this.data.inputFields;
        this.messageData.inputFields[i].value = document.getElementsByName(fields[i].name)[0].value;
    };
    MessageDialogComponent.prototype.submitInputForm = function () {
        this.confirmResult = this.authHttp.post(this.data.postData.url, {
            data: this.messageData.postData.body,
            inputFields: this.messageData.inputFields
        }).map(function (rsp) { return rsp.json(); });
        return this.confirmResult;
    };
    MessageDialogComponent.prototype.ngOnInit = function () {
    };
    MessageDialogComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-message-dialog',
            template: __webpack_require__("./src/app/message-dialog/message-dialog.component.html"),
            styles: [__webpack_require__("./src/app/message-dialog/message-dialog.component.css")],
        }),
        __param(0, Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Inject"])(__WEBPACK_IMPORTED_MODULE_1__angular_material__["a" /* MAT_DIALOG_DATA */])),
        __metadata("design:paramtypes", [Object, __WEBPACK_IMPORTED_MODULE_2__angular_http__["Http"],
            __WEBPACK_IMPORTED_MODULE_2__angular_http__["RequestOptions"]])
    ], MessageDialogComponent);
    return MessageDialogComponent;
}());

var MyMessageDetail = /** @class */ (function () {
    function MyMessageDetail() {
    }
    return MyMessageDetail;
}());

var MyPostData = /** @class */ (function () {
    function MyPostData() {
    }
    return MyPostData;
}());

var MyInputField = /** @class */ (function () {
    function MyInputField() {
    }
    return MyInputField;
}());

var MyMessageData = /** @class */ (function () {
    /**
     * @param type  'messageOnly' | 'confirmForm' | 'inputForm'
     */
    function MyMessageData(type) {
        this.messageOnly = false;
        this.isConfirmForm = false;
        this.isInputForm = false;
        switch (type) {
            case 'messageOnly':
                this.messageOnly = true;
                break;
            case 'confrimForm':
                this.isConfirmForm = true;
                break;
            case 'inputForm':
                this.isInputForm = true;
                break;
            default:
                break;
        }
        this.messageDetail = new MyMessageDetail();
        this.postData = new MyPostData();
        this.inputFields = new Array();
    }
    return MyMessageData;
}());



/***/ }),

/***/ "./src/app/order-submit/order-submit.component.css":
/***/ (function(module, exports) {

module.exports = ":host {\r\n    width: 80%;\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-pack: center;\r\n        -ms-flex-pack: center;\r\n            justify-content: center;\r\n}\r\n\r\n.wrapper {\r\n    width: 100%;\r\n}\r\n\r\n.fieldHead {\r\n    font-weight: bold;\r\n    width: 100%;\r\n}\r\n\r\n.inputField,\r\n.sumField {\r\n    width: 100%;\r\n}\r\n\r\n.fieldContent {\r\n    width: 100%;\r\n    margin-left: 10px;\r\n}\r\n\r\n.plateHead {\r\n    max-width: 50px;\r\n    -webkit-box-flex: 1;\r\n        -ms-flex-positive: 1;\r\n            flex-grow: 1;\r\n}\r\n\r\n.plateBody {\r\n    -webkit-box-flex: 9;\r\n        -ms-flex-positive: 9;\r\n            flex-grow: 9;\r\n}\r\n\r\n#basePriceExpansion,\r\n#basePriceExpansion mat-expansion-panel-header {\r\n    padding: 0;\r\n    -webkit-box-shadow: 0 0 0;\r\n            box-shadow: 0 0 0;\r\n    background: none;\r\n}\r\n\r\n.option {\r\n    -webkit-animation: popup 0.3s ease-out;\r\n            animation: popup 0.3s ease-out;\r\n}\r\n\r\n@-webkit-keyframes popup {\r\n    from {\r\n        width: 80%;\r\n        opacity: 0;\r\n    }\r\n    to {\r\n        width: 100%;\r\n        opacity: 1;\r\n    }\r\n}\r\n\r\n@keyframes popup {\r\n    from {\r\n        width: 80%;\r\n        opacity: 0;\r\n    }\r\n    to {\r\n        width: 100%;\r\n        opacity: 1;\r\n    }\r\n}"

/***/ }),

/***/ "./src/app/order-submit/order-submit.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"wrapper\" fxLayout=\"column\" fxLayoutAlign=\"start start\" fxLayoutGap=\"gappx\">\n  <div class=\"orderTitle\">\n    <h2>创建订单</h2>\n  </div>\n  <!-- <div style=\"flex:1 1 auto;\"></div> -->\n  <div class=\"fieldHead\">\n    服务订单类型\n    <font color=\"red\">*</font>\n  </div>\n  <div class=\"fieldContent\">\n    <div fxLayout=\"row\" fxLayoutAlign=\"start start\" fxLayoutGap=\"gappx\">\n      <mat-form-field class=\"inputField\">\n        <mat-select class=\"option\" [(value)]=\"selectedService\" (change)=\"updateServiceOption()\">\n          <!-- <mat-option *ngFor=\"let state of states\" [value]=\"state\">{{state}}</mat-option> -->\n          <mat-option value=\"carBeautify\">洗车美容</mat-option>\n          <mat-option value=\"carMaintenance\">保养维护</mat-option>\n        </mat-select>\n      </mat-form-field>\n    </div>\n  </div>\n  <div class=\"fieldHead\">\n    车牌号\n    <font color=\"red\">*</font>\n    <button style=\"display:inline-block;min-width:50px;padding:0; position:relative; overflow:hidden;\" mat-button color=\"primary\">\n      <mat-icon class=\"mat-18\">camera_enhance</mat-icon>\n      <input id=\"carPic\" style=\"opacity: 0;position:absolute; right:0; top:0; \" mat-button type=\"file\" (change)=\"addFile()\" ng2FileSelect\n        [uploader]=\"uploader\" />\n    </button>\n  </div>\n  <div class=\"fieldContent\" id=\"plateNo\">\n    <div fxLayout=\"row\" fxLayoutAlign=\"start start\" fxLayoutGap=\"gappx\">\n      <mat-form-field class=\"plateHead\">\n        <input matInput [matAutocomplete]=\"auto\" type=\"text\" placeholder=\"省份\" [(ngModel)]=\"plateAbbr\">\n        <mat-autocomplete #auto=\"matAutocomplete\">\n          <mat-option *ngFor=\"let abbr of provinceAbbr\" [value]=\"abbr.value\">{{abbr.viewValue}}</mat-option>\n        </mat-autocomplete>\n      </mat-form-field>\n      <mat-form-field class=\"plateBody\">\n        <input matInput type=\"text\" placeholder=\"号码\" [(ngModel)]=\"plateString\" required>\n      </mat-form-field>\n    </div>\n  </div>\n  <div class=\"fieldHead\">\n    汽车公里数\n  </div>\n  <div class=\"fieldContent\">\n    <mat-input-container style=\"width:100%\" floatPlaceholder=\"auto\">\n      <input matInput type=\"number\" [(ngModel)]=\"travelMiles\">\n    </mat-input-container>\n  </div>\n  <div class=\"fieldContent\">\n    <div fxLayout=\"row\" fxLayoutAlign=\"center center\" fxLayoutGap=\"gappx\">\n      <div id=\"mileShow\">0</div>\n      <mat-slider style=\"width:80%;\" (input)=\"onChangeMiles($event)\" [disabled]=\"false\" [max]=\"300000\" [min]=\"0\" [step]=\"1\" [tick-interval]=\"100000\" [(ngModel)]=\"travelMiles\">\n      </mat-slider>\n      <div>30万</div>\n    </div>\n  </div>\n  <div class=\"fieldHead\">\n    服务选项\n  </div>\n  <div class=\"fieldContent\">\n    <mat-accordion>\n      <mat-expansion-panel  id=\"basePriceExpansion\">\n        <mat-expansion-panel-header>\n          <mat-panel-title>基础费用</mat-panel-title>\n          <mat-panel-description>\n            <ng-container *ngIf=\"basePrice === 0.00; else hasBasePrice\">\n              默认{{basePrice}}元\n            </ng-container>\n            <ng-template #hasBasePrice>\n              <font color=\"green\" wight=\"bold\">{{basePrice| number : '1.2-2'}}</font>元\n            </ng-template>\n          </mat-panel-description>\n        </mat-expansion-panel-header>\n        <mat-form-field>\n          <input matInput type=\"number\" [(ngModel)]=\"basePrice\" [(value)]=\"basePrice\">\n          <span matPrefix>￥&nbsp;</span>\n        </mat-form-field>\n      </mat-expansion-panel>\n    </mat-accordion>\n  </div>\n  <div class=\"fieldContent\">\n    <div fxLayout=\"row\" fxLayoutAlign=\"start start\" fxLayoutGap=\"gappx\" *ngFor=\"let item of serviceOption | async; index as i; \">\n      <mat-form-field class=\"inputField\">\n        <mat-select (change)=\"updateSelectedOption($event)\" value=\"{{i}}-default\">\n          <!-- <mat-option *ngFor=\"let state of states\" [value]=\"state\">{{state}}</mat-option> -->\n          <mat-option value=\"{{i}}-default\">{{item.name}}: 无</mat-option>\n          <ng-container *ngFor=\"let option of item.options\">\n            <mat-option value=\"{{i}}-{{option.itemName}}\">\n              {{option.itemName}}\n              <font color=\"green\" wight=\"bold\">￥{{option.price| number : '1.2-2'}}</font>\n            </mat-option>\n          </ng-container>\n        </mat-select>\n      </mat-form-field>\n    </div>\n\n    <!-- <div fxLayout=\"row\" fxLayoutAlign=\"start start\" fxLayoutGap=\"gappx\">\n      <mat-form-field class=\"inputField\">\n        <mat-select [(value)]=\"selectedService\">\n          <mat-option value=\"carBeautifyOrder\">洗车美容</mat-option>\n        </mat-select>\n      </mat-form-field>\n    </div> -->\n  </div>\n  <div class=\"fieldContent\">\n    <mat-accordion>\n      <mat-expansion-panel  id=\"basePriceExpansion\">\n        <mat-expansion-panel-header>\n          <mat-panel-title>备注</mat-panel-title>\n          <mat-panel-description></mat-panel-description>\n        </mat-expansion-panel-header>\n        <mat-form-field>\n          <textarea matInput placeholder=\"留言\" [(ngModel)]=\"note\"></textarea>\n        </mat-form-field>\n      </mat-expansion-panel>\n    </mat-accordion>\n  </div>\n  <div class=\"sumField\">\n    <div fxLayout=\"row\" fxLayoutAlign=\"start center\" fxLayoutGap=\"gappx\">\n      <div>\n        <h3>总计:</h3>\n      </div>\n      <div style=\"flex:1 1 auto\"></div>\n      <div>\n        <h3>\n          <font color=\"green\" wight=\"bold\">￥{{sumUp()| number : '1.2-2'}}</font>\n        </h3>\n      </div>\n    </div>\n  </div>\n  <div class=\"fieldHead\">\n    <div fxLayout=\"row-reverse \" style=\"justify-content:space-between;\" fxLayoutGap=\"gappx\">\n      <button mat-raised-button (click)=\"submit()\" color=\"primary\">提交</button>\n    </div>\n  </div>\n</div>"

/***/ }),

/***/ "./src/app/order-submit/order-submit.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return OrderSubmitComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_forms__ = __webpack_require__("./node_modules/@angular/forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_ng2_file_upload__ = __webpack_require__("./node_modules/ng2-file-upload/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_ng2_file_upload___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_ng2_file_upload__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__message_dialog_service__ = __webpack_require__("./src/app/message-dialog.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__entity_service_option__ = __webpack_require__("./src/app/entity/service-option.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__auth_module__ = __webpack_require__("./src/auth.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_rxjs_add_operator_map__ = __webpack_require__("./node_modules/rxjs/_esm5/add/operator/map.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_rxjs_add_operator_filter__ = __webpack_require__("./node_modules/rxjs/_esm5/add/operator/filter.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};










var OrderSubmitComponent = /** @class */ (function () {
    function OrderSubmitComponent(router, messageService, http, requestOption) {
        this.router = router;
        this.messageService = messageService;
        this.http = http;
        this.provinceAbbr = [
            { value: '粤', viewValue: '粤' },
            { value: '赣', viewValue: '赣' },
            { value: '湘', viewValue: '湘' },
            { value: '京', viewValue: '京' },
            { value: '冀', viewValue: '冀' },
            { value: '苏', viewValue: '苏' },
            { value: '豫', viewValue: '豫' },
            { value: '辽', viewValue: '辽' },
            { value: '黑', viewValue: '黑' },
            { value: '皖', viewValue: '皖' },
            { value: '新', viewValue: '新' },
            { value: '鄂', viewValue: '鄂' },
            { value: '晋', viewValue: '晋' },
            { value: '陕', viewValue: '陕' },
            { value: '吉', viewValue: '吉' },
            { value: '青', viewValue: '青' },
            { value: '甘', viewValue: '甘' },
            { value: '贵', viewValue: '贵' },
            { value: '浙', viewValue: '浙' },
            { value: '鲁', viewValue: '鲁' },
            { value: '蒙', viewValue: '蒙' },
            { value: '藏', viewValue: '藏' },
            { value: '闽', viewValue: '闽' },
            { value: '川', viewValue: '川' },
            { value: '琼', viewValue: '琼' },
            { value: '云', viewValue: '云' }
        ];
        this.abbrControl = new __WEBPACK_IMPORTED_MODULE_1__angular_forms__["b" /* FormControl */]();
        // 此处的值是mat option的value 而不是viewValue
        this.selectedService = 'carBeautify';
        this.selectedOption = new Array();
        this.plateString = '';
        this.plateAbbr = '粤';
        this.basePrice = 0.00;
        this.travelMiles = 0;
        this.note = '';
        this.authHttp = Object(__WEBPACK_IMPORTED_MODULE_5__auth_module__["b" /* authHttpServiceFactory */])(http, requestOption);
        this.uploader = new __WEBPACK_IMPORTED_MODULE_2_ng2_file_upload__["FileUploader"]({
            url: '/plate-recognize/order',
            authToken: localStorage.getItem('token')
        });
    }
    OrderSubmitComponent.prototype.ngOnInit = function () {
        // console.log('此时执行创建方法:');
        this.updateServiceOption();
    };
    OrderSubmitComponent.prototype.ngOnDestroy = function () {
        // 在切换component时会执行销毁方法
        // console.log('此时执行销毁方法');
    };
    OrderSubmitComponent.prototype.updateServiceOption = function () {
        var _this = this;
        this.authHttp.get('/serviceOption/' + this.selectedService + '/all').subscribe(function (data) {
            // TODO 刷新服务选项
            var array = data.json();
            _this.serviceOption = Object(__WEBPACK_IMPORTED_MODULE_4__entity_service_option__["b" /* mapServiceOption */])(array);
            _this.serviceOption.map(function (options) { return options.length; }).subscribe(function (value) {
                _this.selectedOption = new Array(value);
            });
            // console.log(this.serviceOption);
        }, function (error) {
            _this.messageService.showMessage('发生错误', error);
        }, function () { });
    };
    /**
      * 上传车牌图片并识别
      */
    OrderSubmitComponent.prototype.addFile = function () {
        var _this = this;
        // TODO 压缩图片
        // .....
        console.log(this.uploader.queue[0]);
        this.uploader.queue[0].upload();
        this.uploader.response.subscribe(function (next) {
            var result = JSON.parse(next);
            if (result['success']) {
                _this.plateAbbr = result['content']['plateAbbr'];
                _this.plateString = result['content']['plateString'];
            }
            else {
                _this.messageService.showMessage('发生错误', result['msg']);
            }
            // 完成上传
            _this.uploader.clearQueue();
            _this.uploader.response.observers.shift();
            _this.uploader.isUploading = false;
            // as reason of TS is a typesafe lanuage. operater value before type convertion;
            document.getElementById('carPic').value = '';
        }, function (error) {
            _this.uploader.clearQueue();
            _this.messageService.showMessage('发生错误', error);
        }, function () {
            console.log('完成车牌图片上传');
        });
    };
    OrderSubmitComponent.prototype.updateSelectedOption = function (event) {
        var _this = this;
        var valueSet = event.value.split('-', 2);
        var pos = Number.parseInt(valueSet[0], 10);
        this.serviceOption.subscribe(function (array) {
            for (var index = 0; index < array.length; index++) {
                var oD = array[index].options.filter(function (option) { return option.itemName === valueSet[1]; });
                if (oD.length > 0) {
                    var item = new __WEBPACK_IMPORTED_MODULE_4__entity_service_option__["a" /* ServiceOption */]();
                    item.optionType = array[index].optionType;
                    item.itemName = oD[0].itemName;
                    item.price = oD[0].price;
                    _this.selectedOption[pos] = item;
                    return;
                }
                else if (valueSet[1] === 'default') {
                    var item = new __WEBPACK_IMPORTED_MODULE_4__entity_service_option__["a" /* ServiceOption */]();
                    item.optionType = array[index].optionType;
                    item.itemName = 'default';
                    item.price = 0.00;
                    _this.selectedOption[pos] = item;
                    return;
                }
            }
        });
        /**
         * filter 用法
         */
        // this.serviceOption.filter((array: ServiceOption[], index) => {
        //   if (array[index].options.filter(option => option.itemName === valueSet[1]).length > 0) {
        //     return true;
        //   } else {
        //     return false;
        //   }
        // }).subscribe(array => {
        //   this.selectedOption[valueSet[0]].optionType =  array.pop().optionType;
        // });
    };
    OrderSubmitComponent.prototype.onChangeMiles = function (event) {
        this.travelMiles = event.value;
    };
    OrderSubmitComponent.prototype.sumUp = function () {
        var sum = this.basePrice;
        this.selectedOption.forEach(function (option) {
            sum += option.price;
        });
        return sum;
    };
    OrderSubmitComponent.prototype.submit = function () {
        var _this = this;
        if (this.plateString === '' || this.plateAbbr === '') {
            this.messageService.showMessage('订单数据有误', '车牌号未填写');
            return;
        }
        var orderDto = {
            'selectedService': this.selectedService,
            'plateNo': this.plateAbbr + this.plateString.toUpperCase(),
            'basePrice': this.basePrice,
            'travelMiles': this.travelMiles,
            'note': this.note
        };
        this.authHttp.post('/order/' + this.selectedService + '/submit', {
            'orderDto': orderDto,
            'optionDto': this.selectedOption,
            'total': this.sumUp()
        }).subscribe(function (next) {
            var result = next.json();
            if (result['success']) {
                _this.messageService.showMessage('订单提交成功', '请开始作业');
            }
            else {
                _this.messageService.showMessage('订单提交失败', result['msg']);
            }
        }, function (error) {
            _this.messageService.showMessage('订单提交失败', error);
        }, function () {
            // this.router.navigate(['work-list']);
        });
    };
    OrderSubmitComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-order-submit',
            template: __webpack_require__("./src/app/order-submit/order-submit.component.html"),
            styles: [__webpack_require__("./src/app/order-submit/order-submit.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_9__angular_router__["a" /* Router */],
            __WEBPACK_IMPORTED_MODULE_3__message_dialog_service__["a" /* MessageDialogService */],
            __WEBPACK_IMPORTED_MODULE_6__angular_http__["Http"], __WEBPACK_IMPORTED_MODULE_6__angular_http__["RequestOptions"]])
    ], OrderSubmitComponent);
    return OrderSubmitComponent;
}());



/***/ }),

/***/ "./src/app/product-retrieve.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ProductRetrieveService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("./node_modules/@angular/common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_observable_of__ = __webpack_require__("./node_modules/rxjs/_esm5/observable/of.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__message_dialog_service__ = __webpack_require__("./src/app/message-dialog.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var httpOptions = {
    headers: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["d" /* HttpHeaders */]({ 'Content-Type': 'application/json' })
};
var ProductRetrieveService = /** @class */ (function () {
    function ProductRetrieveService(http, messageService) {
        this.http = http;
        this.messageService = messageService;
        this.homeProductUrl = '/home/product/'; // URL to web api
    }
    ProductRetrieveService.prototype.getAllProduct = function () {
        return this.http.get(this.homeProductUrl + 'all');
        // .pipe(
        //   tap(heroes => this.log(`fetched heroes`)),
        //   catchError(this.handleError('getHeroes', []))
        // );
    };
    ProductRetrieveService.prototype.findProductFromHome = function (keyword) {
        return this.http.get(this.homeProductUrl + 'findFromHome?keyword=' + keyword);
    };
    /**
     * Handle Http operation that failed.
     * Let the app continue.
     * @param operation - name of the operation that failed
     * @param result - optional value to return as the observable result
     */
    ProductRetrieveService.prototype.handleError = function (operation, result) {
        var _this = this;
        if (operation === void 0) { operation = 'operation'; }
        return function (error) {
            // TODO: send the error to remote logging infrastructure
            console.error(error); // log to console instead
            // TODO: better job of transforming error for user consumption
            _this.log(operation + " failed: " + error.message);
            // Let the app keep running by returning an empty result.
            return Object(__WEBPACK_IMPORTED_MODULE_2_rxjs_observable_of__["a" /* of */])(result);
        };
    };
    /** Log a HeroService message with the MessageService */
    ProductRetrieveService.prototype.log = function (message) {
        // this.messageService.add('HeroService: ' + message);
    };
    ProductRetrieveService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Injectable"])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_common_http__["a" /* HttpClient */],
            __WEBPACK_IMPORTED_MODULE_3__message_dialog_service__["a" /* MessageDialogService */]])
    ], ProductRetrieveService);
    return ProductRetrieveService;
}());



/***/ }),

/***/ "./src/app/slide-nav/slide-nav.component.css":
/***/ (function(module, exports) {

module.exports = ".example-sidenav-content {\r\n    /* margin-top: 64px; */\r\n    overflow: visible;\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    height: 100%;\r\n    /* align-items: center; */\r\n    -webkit-box-pack: center;\r\n        -ms-flex-pack: center;\r\n            justify-content: center;\r\n}\r\n\r\n.example-sidenav {\r\n    color: #fff;\r\n    min-width: 15%;\r\n    background-color: #3f51b5;\r\n    padding: 20px;\r\n}\r\n\r\n#menuList {\r\n    color: white;\r\n}\r\n\r\n#menuList .mat-button {\r\n    color: white;\r\n}\r\n\r\n.example-container {\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-orient: vertical;\r\n    -webkit-box-direction: normal;\r\n        -ms-flex-direction: column;\r\n            flex-direction: column;\r\n    position: absolute;\r\n    top: 64px;\r\n    bottom: 0;\r\n    left: 0;\r\n    right: 0;\r\n}\r\n\r\n@media (max-width: 599px) {\r\n    .example-container {\r\n        top: 56px;\r\n    }\r\n}\r\n\r\n.menuButton {\r\n    /* position: absolute;\r\n    left: 0;\r\n    top: 54px; */\r\n    color: white;\r\n    outline: none;\r\n    min-width: 50px;\r\n    padding: 0;\r\n}"

/***/ }),

/***/ "./src/app/slide-nav/slide-nav.component.html":
/***/ (function(module, exports) {

module.exports = "<mat-drawer-container class=\"example-container\" autosize>\n  <!-- 菜单栏 -->\n  <mat-drawer color=\"primary\" #drawer class=\"example-sidenav\" mode='over'>\n    <div>\n      <mat-list id=\"menuList\">\n        <mat-list-item>\n          <a mat-button focus='false' routerLink=\"/\" (click)=\"drawer.toggle()\">首页</a>\n        </mat-list-item>\n        <mat-divider></mat-divider>\n        <mat-list-item >\n          <a mat-button routerLink=\"/carEnterance\" (click)=\"drawer.toggle()\">扫描车牌</a>\n        </mat-list-item>\n        <mat-divider></mat-divider>\n        <mat-list-item>\n          <a mat-button routerLink=\"/table\" (click)=\"drawer.toggle()\">列表</a>\n        </mat-list-item>\n        <mat-divider></mat-divider>\n        <mat-list-item>\n          <a mat-button routerLink=\"/orderSubmit\" (click)=\"drawer.toggle()\">创建订单</a>\n        </mat-list-item>\n        <mat-divider></mat-divider>\n        <mat-list-item>\n          <a mat-button routerLink=\"/cashier-board\" (click)=\"drawer.toggle()\">收银台</a>\n        </mat-list-item>\n        <mat-divider></mat-divider>\n\n      </mat-list>\n    </div>\n  </mat-drawer>\n\n  <!-- 主页面 -->\n  <mat-toolbar *ngIf=\"true||this.jwtService.hasOneOfAuthorities(['ROLE_STAFF','ROLE_ADMIN'])\"  color=\"primary\">\n    <button class=\"menuButton\" type=\"button\" mat-button (click)=\"drawer.toggle()\">\n      <mat-icon class=\"example-icon\">menu</mat-icon>\n    </button>\n  </mat-toolbar>\n  <div class=\"example-sidenav-content\">\n    <router-outlet></router-outlet>\n  </div>\n</mat-drawer-container>"

/***/ }),

/***/ "./src/app/slide-nav/slide-nav.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SlideNavComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__jwt_service__ = __webpack_require__("./src/app/jwt.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var SlideNavComponent = /** @class */ (function () {
    function SlideNavComponent(jwtService) {
        this.jwtService = jwtService;
    }
    SlideNavComponent.prototype.ngOnInit = function () {
    };
    SlideNavComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-slide-nav',
            template: __webpack_require__("./src/app/slide-nav/slide-nav.component.html"),
            styles: [__webpack_require__("./src/app/slide-nav/slide-nav.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__jwt_service__["a" /* JwtService */]])
    ], SlideNavComponent);
    return SlideNavComponent;
}());



/***/ }),

/***/ "./src/app/staff-work-list/staff-work-list.component.css":
/***/ (function(module, exports) {

module.exports = ":host {\r\n    width: 80%;\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -webkit-box-pack: center;\r\n        -ms-flex-pack: center;\r\n            justify-content: center;\r\n}\r\n\r\n.wrapper {\r\n    width: 100%;\r\n}\r\n\r\n.ordersPanel {\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    -ms-flex-wrap: wrap;\r\n        flex-wrap: wrap;\r\n    padding: 5px;\r\n    flex-wrap: wrap;\r\n    -webkit-box-pack: start;\r\n        -ms-flex-pack: start;\r\n            justify-content: flex-start;\r\n}\r\n\r\n.orderItem {\r\n    margin: 5px 5px;\r\n    width: 300px;\r\n    height: 100%;\r\n    opacity: 1;\r\n    -webkit-transition: all ease-out 0.2s;\r\n    transition: all ease-out 0.2s;\r\n    -webkit-animation: circleTocube 0.4s ease-out;\r\n            animation: circleTocube 0.4s ease-out;\r\n}\r\n\r\n#basePriceExpansion,\r\n#basePriceExpansion mat-expansion-panel-header {\r\n    padding: 0;\r\n    -webkit-box-shadow: 0 0 0;\r\n            box-shadow: 0 0 0;\r\n    background: none;\r\n}\r\n\r\n.flush {\r\n    width: 210px;\r\n    opacity: 0;\r\n}\r\n\r\n.paginator {\r\n    -webkit-box-shadow: 0px -3px 8px rgba(0, 0, 0, 0.38);\r\n            box-shadow: 0px -3px 8px rgba(0, 0, 0, 0.38);\r\n    padding: 0px 20px;\r\n    background-color: #3f51b5;\r\n    color: white;\r\n    -webkit-box-align: center;\r\n        -ms-flex-align: center;\r\n            align-items: center;\r\n    -ms-flex-line-pack: center;\r\n        align-content: center;\r\n    display: -webkit-box;\r\n    display: -ms-flexbox;\r\n    display: flex;\r\n    position: fixed;\r\n    bottom: 0;\r\n    left: 0;\r\n    width: 100%;\r\n    z-index: 2;\r\n}\r\n\r\n@-webkit-keyframes circleTocube {\r\n    from {\r\n        border-radius: 100px;\r\n    }\r\n    to {\r\n        border-radius: 2px;\r\n    }\r\n}\r\n\r\n@keyframes circleTocube {\r\n    from {\r\n        border-radius: 100px;\r\n    }\r\n    to {\r\n        border-radius: 2px;\r\n    }\r\n}"

/***/ }),

/***/ "./src/app/staff-work-list/staff-work-list.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"wrapper\">\n  <mat-tab-group (selectedTabChange)=\"active($event)\" [disableRipple]=\"false\">\n    <!-- 准备中 -->\n    <mat-tab origin=0 label=\"准备中\">\n      <div class=\"ordersPanel\" *ngIf=\"this.activePage==='PENDING'\">\n        <ng-container *ngFor=\"let item of pendingPage.content\">\n          <mat-card class=\"orderItem\">\n            <mat-card-header>\n              <mat-card-title>\n                <h5>\n                  <b>{{item.name}}</b>\n                </h5>\n              </mat-card-title>\n              <mat-card-subtitle>\n                <i style=\"font-size:10px;\">{{item.orderNo}}</i>\n              </mat-card-subtitle>\n            </mat-card-header>\n            <mat-card-content>\n              <mat-accordion>\n                <mat-expansion-panel id=\"basePriceExpansion\">\n                  <mat-expansion-panel-header>\n                    <mat-panel-title>详情</mat-panel-title>\n                    <mat-panel-description>公里数：{{item.travelMiles}}</mat-panel-description>\n                  </mat-expansion-panel-header>\n                  <mat-list>\n                    <ng-container *ngFor=\"let key of item.optionKeys\">\n                      <mat-list-item>\n                        <font weight=\"blod\">{{key}}</font>\n                      </mat-list-item>\n                      <mat-divider></mat-divider>\n                    </ng-container>\n                  </mat-list>\n                </mat-expansion-panel>\n              </mat-accordion>\n            </mat-card-content>\n            <mat-card-actions>\n              <button align=\"start\" mat-raised-button color=\"primary\" (click)=\"submitWork('start', item.orderNo,$event )\">开始</button>\n              <button align=\"end\" mat-button color=\"primary\" (click)=\"submitWork('cancel' ,item.orderNo,$event )\">取消</button>\n              <div>总价：\n                <font color=\"green\">{{item.total}}</font>\n              </div>\n            </mat-card-actions>\n            <mat-card-footer>\n              <ng-container *ngIf=\"item.note!==''\">\n                <div align=\"start\">备注\n                  <font align=\"end\" color=\"blue\" weight=\"bold\">{{item.note}}</font>\n                </div>\n              </ng-container>\n            </mat-card-footer>\n          </mat-card>\n        </ng-container>\n      </div>\n\n    </mat-tab>\n    <!-- 进行中 -->\n    <mat-tab origin=1 label=\"进行中\">\n      <div class=\"ordersPanel\" *ngIf=\"this.activePage==='WORKING'\">\n        <ng-container *ngFor=\"let item of pendingPage.content\">\n          <mat-card class=\"orderItem\">\n            <mat-card-header>\n              <mat-card-title>\n                <h5>\n                  <b>{{item.name}}</b>\n                </h5>\n              </mat-card-title>\n              <mat-card-subtitle>\n                <i style=\"font-size:10px;\"> item.orderNo </i>\n              </mat-card-subtitle>\n            </mat-card-header>\n            <mat-card-content>\n              <mat-accordion>\n                <mat-expansion-panel id=\"basePriceExpansion\">\n                  <mat-expansion-panel-header>\n                    <mat-panel-title>详情</mat-panel-title>\n                    <mat-panel-description>公里数：{{item.travelMiles}}</mat-panel-description>\n                  </mat-expansion-panel-header>\n                  <mat-list>\n                    <ng-container *ngFor=\"let key of item.optionKeys\">\n                      <mat-list-item>\n                        <font weight=\"blod\">{{key}}</font>\n                      </mat-list-item>\n                      <mat-divider></mat-divider>\n                    </ng-container>\n                  </mat-list>\n                </mat-expansion-panel>\n              </mat-accordion>\n            </mat-card-content>\n            <mat-card-actions>\n              <button align=\"start\" mat-raised-button color=\"primary\" (click)=\"submitWork('finish', item.orderNo,$event )\">完成</button>\n              <button align=\"end\" mat-button color=\"primary\" (click)=\"submitWork('cancel', item.orderNo,$event )\">取消</button>\n              <div>总价：\n                <font color=\"green\">{{item.total}}</font>\n              </div>\n            </mat-card-actions>\n            <mat-card-footer>\n              <ng-container *ngIf=\"item.note!==''\">\n                <div align=\"start\">备注\n                  <font align=\"end\" color=\"blue\" weight=\"bold\">{{item.note}}</font>\n                </div>\n              </ng-container>\n            </mat-card-footer>\n          </mat-card>\n        </ng-container>\n      </div>\n    </mat-tab>\n    <!-- 待确认 -->\n    <mat-tab origin=2 label=\"待确认\">\n      <div *ngIf=\"activePage==='WAITING_CONFIRM'\">\n      <ng-container *ngFor=\"let item of pendingPage.content\">\n        <mat-card class=\"orderItem\">\n          <mat-card-header>\n            <mat-card-title>\n              <h5>\n                <b>{{item.name}}</b>\n              </h5>\n            </mat-card-title>\n            <mat-card-subtitle>\n              <i style=\"font-size:10px;\"> item.orderNo </i>\n            </mat-card-subtitle>\n          </mat-card-header>\n          <mat-card-content>\n            <mat-accordion>\n              <mat-expansion-panel id=\"basePriceExpansion\">\n                <mat-expansion-panel-header>\n                  <mat-panel-title>详情</mat-panel-title>\n                  <mat-panel-description>公里数：{{item.travelMiles}}</mat-panel-description>\n                </mat-expansion-panel-header>\n                <mat-list>\n                  <ng-container *ngFor=\"let key of item.optionKeys\">\n                    <mat-list-item>\n                      <font weight=\"blod\">{{key}}</font>\n                    </mat-list-item>\n                    <mat-divider></mat-divider>\n                  </ng-container>\n                </mat-list>\n              </mat-expansion-panel>\n            </mat-accordion>\n          </mat-card-content>\n          <mat-card-actions>\n            <div>总价：\n              <font color=\"green\">{{item.total}}</font>\n            </div>\n          </mat-card-actions>\n          <mat-card-footer>\n            <ng-container *ngIf=\"item.note!==''\">\n              <div align=\"start\">备注\n                <font align=\"end\" color=\"blue\" weight=\"bold\">{{item.note}}</font>\n              </div>\n            </ng-container>\n          </mat-card-footer>\n        </mat-card>\n      </ng-container>\n      </div>\n    </mat-tab>\n    <!-- 已完成 -->\n    <mat-tab origin=3 (selectedTabChange)=\"active($event)\" label=\"已完成\">\n      <div *ngIf=\"activePage==='FINISHED'\">\n<ng-container *ngFor=\"let item of pendingPage.content\">\n  <mat-card class=\"orderItem\">\n    <mat-card-header>\n      <mat-card-title>\n        <h5>\n          <b>\n            <ng-container *ngIf=\"item.state ==='UNPAY'\">\n              [<font color=\"red\">未付款</font>]\n            </ng-container>\n            <ng-container *ngIf=\"item.state ==='FINISHED'\">\n              [\n              <font color=\"green\">已付款</font>]\n            </ng-container>\n          </b><br>\n           {{item.name}}\n        </h5>\n      </mat-card-title>\n      <mat-card-subtitle>\n        <i style=\"font-size:10px;\">{{ item.orderNo}} </i>\n      </mat-card-subtitle>\n    </mat-card-header>\n    <mat-card-content>\n      <mat-accordion>\n        <mat-expansion-panel id=\"basePriceExpansion\">\n          <mat-expansion-panel-header>\n            <mat-panel-title>详情</mat-panel-title>\n            <mat-panel-description>公里数：{{item.travelMiles}}</mat-panel-description>\n          </mat-expansion-panel-header>\n          <mat-list>\n            <ng-container *ngFor=\"let key of item.optionKeys\">\n              <mat-list-item>\n                <font weight=\"blod\">{{key}}</font>\n              </mat-list-item>\n              <mat-divider></mat-divider>\n            </ng-container>\n          </mat-list>\n        </mat-expansion-panel>\n      </mat-accordion>\n    </mat-card-content>\n    <mat-card-actions>\n      <div>总价：\n        <font color=\"green\">{{item.total}}</font>\n      </div>\n    </mat-card-actions>\n    <mat-card-footer>\n      <ng-container *ngIf=\"item.note!==''\">\n        <div align=\"start\">备注\n          <font align=\"end\" color=\"blue\" weight=\"bold\">{{item.note}}</font>\n        </div>\n      </ng-container>\n    </mat-card-footer>\n  </mat-card>\n</ng-container>\n      </div>\n    </mat-tab>\n  </mat-tab-group>\n  <div class=\"paginator\">\n    <div>第{{pendingPage.number+1}}/{{pendingPage.totalPages}}页</div>\n    <div style=\"flex:1 1 auto;\"></div>\n    <div>\n      <button mat-icon-button [disabled]=\"pageEnd(false)\" (click)=\"beforePage()\">\n        <mat-icon class=\"mat-18\">navigate_before</mat-icon>\n      </button>\n      <button mat-icon-button [disabled]=\"pageEnd(true)\" (click)=\"nextPage()\">\n        <mat-icon class=\"mat-18\">navigate_next</mat-icon>\n      </button>\n    </div>\n  </div>\n</div>"

/***/ }),

/***/ "./src/app/staff-work-list/staff-work-list.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StaffWorkListComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__message_dialog_service__ = __webpack_require__("./src/app/message-dialog.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__auth_module__ = __webpack_require__("./src/auth.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__entity_page__ = __webpack_require__("./src/app/entity/page.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__entity_order__ = __webpack_require__("./src/app/entity/order.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_rxjs_add_operator_delay__ = __webpack_require__("./node_modules/rxjs/_esm5/add/operator/delay.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};







var StaffWorkListComponent = /** @class */ (function () {
    function StaffWorkListComponent(messageService, http, requestOption) {
        this.messageService = messageService;
        this.http = http;
        this.progress = 'PENDING';
        this.activePage = 'PENDING';
        this.pendingPage = new __WEBPACK_IMPORTED_MODULE_4__entity_page__["a" /* Page */]();
        this.pageSize = 5;
        this.authHttp = Object(__WEBPACK_IMPORTED_MODULE_3__auth_module__["b" /* authHttpServiceFactory */])(http, requestOption);
    }
    StaffWorkListComponent.prototype.ngOnInit = function () {
        this.updateWorkList(1, this.pageSize, 'PENDING');
    };
    StaffWorkListComponent.prototype.active = function (event) {
        switch (event.index) {
            case 0:
                this.activePage = 'PENDING';
                break;
            case 1:
                this.activePage = 'WORKING';
                break;
            case 2:
                this.activePage = 'WAITING_CONFIRM';
                break;
            case 3:
                this.activePage = 'FINISHED';
                break;
        }
        this.updateWorkList(1, 5, this.activePage);
    };
    StaffWorkListComponent.prototype.findParent = function (element, parentClass) {
        if (element.parentElement.classList.contains(parentClass)) {
            return element.parentElement;
        }
        else {
            return this.findParent(element.parentElement, parentClass);
        }
    };
    StaffWorkListComponent.prototype.submitWork = function (action, orderNo, event) {
        var _this = this;
        var url = '/order/' + action + 'Work';
        // event.srcElement.parentElement.parentElement.parentElement.className += ' flush';
        this.findParent(event.srcElement.parentElement, 'orderItem').className += ' flush';
        this.authHttp.post(url, {
            'orderNo': orderNo
        }).map(function (result) { return result.json(); }).delay(300).subscribe(function (next) {
            if (next['success']) {
                _this.pendingPage.content = _this.pendingPage.content.filter(function (child) {
                    return child.orderNo !== orderNo;
                });
                _this.messageService.showMessage('成功', next['msg']);
                // this.updateWorkList(this.pendingPage.number + 1, this.pageSize, this.progress);
            }
            else {
                // event.srcElement.parentElement.parentElement.parentElement.classList.remove('flush');
                _this.findParent(event.srcElement.parentElement, 'orderItem').classList.remove('flush');
                _this.messageService.showMessage('提交失败', next['msg']);
            }
        });
    };
    StaffWorkListComponent.prototype.pageEnd = function (isNext) {
        if (isNext) {
            return (this.pendingPage.number + 1) >= this.pendingPage.totalPages;
        }
        else {
            return this.pendingPage.number <= 0;
        }
    };
    StaffWorkListComponent.prototype.beforePage = function () {
        // pageNum=(number+1) nextPage=(number+1)+1
        this.updateWorkList(this.pendingPage.number, this.pageSize, this.progress);
    };
    StaffWorkListComponent.prototype.nextPage = function () {
        this.updateWorkList(this.pendingPage.number + 2, this.pageSize, this.progress);
    };
    StaffWorkListComponent.prototype.updateWorkList = function (pageNum, pageSize, progress) {
        var _this = this;
        this.authHttp.post('/order/workList', {
            'pageableBuilder': {
                'pageNum': pageNum,
                'pageSize': pageSize
            },
            'progress': progress
        })
            .map(function (result) { return result.json(); })
            .subscribe(function (next) {
            _this.pendingPage = Object(__WEBPACK_IMPORTED_MODULE_4__entity_page__["b" /* jsonToPage */])(next['content']);
            _this.pendingPage.content = Object(__WEBPACK_IMPORTED_MODULE_5__entity_order__["b" /* getOrdersFromPage */])(_this.pendingPage);
        });
    };
    StaffWorkListComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-staff-work-list',
            template: __webpack_require__("./src/app/staff-work-list/staff-work-list.component.html"),
            styles: [__webpack_require__("./src/app/staff-work-list/staff-work-list.component.css")],
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__message_dialog_service__["a" /* MessageDialogService */],
            __WEBPACK_IMPORTED_MODULE_2__angular_http__["Http"],
            __WEBPACK_IMPORTED_MODULE_2__angular_http__["RequestOptions"]])
    ], StaffWorkListComponent);
    return StaffWorkListComponent;
}());



/***/ }),

/***/ "./src/auth.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (immutable) */ __webpack_exports__["b"] = authHttpServiceFactory;
/* harmony export (immutable) */ __webpack_exports__["c"] = customAuthHttpServiceFactory;
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AuthModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_angular2_jwt__ = __webpack_require__("./node_modules/angular2-jwt/angular2-jwt.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_angular2_jwt___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_angular2_jwt__);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



/**
 * 获取默认的authHttp
 * @param http http工具
 * @param options http请求选项
 */
function authHttpServiceFactory(http, options) {
    return new __WEBPACK_IMPORTED_MODULE_2_angular2_jwt__["AuthHttp"](new __WEBPACK_IMPORTED_MODULE_2_angular2_jwt__["AuthConfig"]({
        noTokenScheme: true,
        tokenName: 'token',
        tokenGetter: (function () { return localStorage.getItem('token'); }),
        globalHeaders: [{ 'Content-Type': 'application/json' }],
    }), http, options);
}
/**
 * 获取定制的authHttp
 * @param authConfig 个性设置认证配置内容包括 token前缀 token获取函数...
 * @param http @see authHttpServiceFactory
 * @param options @see authHttpServiceFactory
 */
function customAuthHttpServiceFactory(authConfig, http, options) {
    return new __WEBPACK_IMPORTED_MODULE_2_angular2_jwt__["AuthHttp"](authConfig, http, options);
}
var AuthModule = /** @class */ (function () {
    function AuthModule() {
    }
    AuthModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["NgModule"])({
            providers: [
                {
                    provide: __WEBPACK_IMPORTED_MODULE_2_angular2_jwt__["AuthHttp"],
                    useFactory: authHttpServiceFactory,
                    deps: [__WEBPACK_IMPORTED_MODULE_1__angular_http__["Http"], __WEBPACK_IMPORTED_MODULE_1__angular_http__["RequestOptions"]]
                }
            ]
        })
    ], AuthModule);
    return AuthModule;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
var environment = {
    production: false
};


/***/ }),

/***/ "./src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("./node_modules/@angular/platform-browser-dynamic/esm5/platform-browser-dynamic.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("./src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("./src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["enableProdMode"])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("./src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map