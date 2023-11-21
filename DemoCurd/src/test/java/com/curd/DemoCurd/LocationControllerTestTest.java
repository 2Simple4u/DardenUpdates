package com.curd.DemoCurd;

import com.curd.DemoCurd.controller.LocationController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;

@WebMvcTest(LocationController.class)
//@ContextConfiguration(classes = { LocationController.class })
class LocationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @MockBean
    private LocationService locationService;

    @MockBean
    private JwtUtils jwtUtils;

    @MockBean
    private LocationValidator locationValidator;

//    @BeforeEach
//    void setUp() {
//        RequestContext.setConcept("1");
//        RequestContext.setCorrelationId("d64cf01b-ce65-4a57-ac3e-f7fa09e1a87f");
//        RequestContext.setUserName("USER");
//    }

    @Nested
    class getLocation {
        @Test
        void testGetAllLocationRestaurant() throws Exception {

            Mockito.when(jwtUtils.findUserDetail(Mockito.any())).thenReturn("User");


            Mockito.when(locationService.getAllLocationsByConceptId()).thenReturn(locationResponseList);

            Mockito.when(locationService.getAllReferenceData()).thenReturn(referenceData);

            MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            params.put("false", Arrays.asList("isRefDataReq", "isAllRestaurantReq", "templateDataReq", "isDeployableRestaurantReq"));
            mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/location").params(params)).andExpect(status().isOk());
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/location?isAllRestaurantReq=false")).andExpect(status().isOk());
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/location?templateDataReq=false")).andExpect(status().isOk());
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/location?isDeployableRestaurantReq=false")).andExpect(status().isOk());

        }
                
        @Test
        void testGetLocationDetail() throws Exception {
            Mockito.when(jwtUtils.findUserDetail(Mockito.any())).thenReturn("User");

            Mockito.when(locationService.getLocationDetails(restaurantNumber)).thenReturn(locationDetailResponse);

            mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/location/{restaurantNumber}", 1)).andExpect(status().isOk());
        }

        @Test
        void shouldAddLocation() throws Exception {

            Mockito.when(jwtUtils.findUserDetail(Mockito.any())).thenReturn("User");
            Mockito.when(locationService.createLocation(locationRequest, "user")).thenReturn(response);

            mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/location/").contentType(MediaType.APPLICATION_JSON)
                    .content(mapper.writeValueAsString(createUpdateLocationList))).andExpect(status().isCreated())
                    .andExpect(jsonPath("status", is(201)));
        }

        @Test
        void shouldUpdateLocation() throws Exception {
            Mockito.when(jwtUtils.findUserDetail(Mockito.any())).thenReturn("User");
            Mockito.when(locationService.updateLocation(locationRestRequest, userName)).thenReturn(response);
            mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/location", 1)
                    .contentType(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
                    .content(mapper.writeValueAsString(createUpdateChargeRequest))).andExpect(status().isOk());
        }

        @Test
        void shouldDeleteLocationByRestaurantNumberWhenIsDeletedFlagIsTrue() throws Exception {
            Mockito.when(jwtUtils.findUserDetail(Mockito.any())).thenReturn("User");
            Mockito.when(locationService.deleteByRestNumber(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(re);
            doNothing().when(locationService).deleteByRestNumber("1", "Y", "User");
            mockMvc.perform(MockMvcRequestBuilders.patch("/api/v1/location/{restaurantNbr}", 1).param("deleteConfirmed", "Y")
                    .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isAccepted())
                    .andExpect(jsonPath("status", is(202)));
        }

        @Test
        void shouldDeleteLocationByRestaurantNumberWhenIsDeletedFlagIsFalse() throws Exception {
            Mockito.when(jwtUtils.findUserDetail(Mockito.any())).thenReturn("User");
            Mockito.when(locationService.deleteByRestNumber(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(re);
            doNothing().when(locationService).deleteByRestNumber("1", "Y", "User");
            mockMvc.perform(MockMvcRequestBuilders.patch("/api/v1/location/{restaurantNbr}", 1).param("deleteConfirmed", "F")
                    .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isAccepted())
                    .andExpect(jsonPath("status", is(202)));
        }

        @Test
        void shouldGetAllLocationRestaurantWithoutAccessToken() throws Exception {

            Mockito.when(locationService.getAllLocationsByConceptId(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(locationResponseList);
            Mockito.when(locationService.getAllReferenceData()).thenReturn(referenceData);
            mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/location")).andExpect(status().isOk());
        }

        @Test
        void shouldGetAllRestaurantReferenceData() throws Exception {

            Mockito.when(locationService.getAllAdditiveReferenceData(conceptId)).thenReturn(response);
            mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/location")).andExpect(status().isOk());
        }

        @Test
        void shouldGetAllRestaurantConfigReferenceData() throws Exception {
            Mockito.when(locationService.getAllRestaurantConfigReferenceData(conceptId)).thenReturn(response);
            mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/location")).andExpect(status().isOk());
        }

        @Test
        void shouldGetAllLocationService() throws Exception {
            Mockito.when(locationService.getAllLocationService()).thenReturn(response);
            mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/location")).andExpect(status().isOk());
        }

        @Test
        void shouldGetAllOverridingReferenceData() throws Exception {
            Mockito.when(locationService.getAllOverridingReferenceData(conceptId)).thenReturn(response);
            mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/location")).andExpect(status().isOk());
        }

    }
}